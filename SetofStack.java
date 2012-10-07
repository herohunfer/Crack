import java.util.*;
public class SetofStack {
	Node top;
	SetofStack next = null;
	int size;
	int capacity;
	public SetofStack(Object o,  int capacity) {
		top = new Node(o);
		size = 1;
		this.capacity = capacity;
	}
	public Object pop() {
		if (size > 0) { 
			size--;
			Object temp = top.data;
			top = top.next;
			return temp;
		}
		else return null;
	}
	public void push(Object o) {
		++size;
		if (size > capacity) {
			size--;
			next = new SetofStack(o, capacity);
		}
		else {
			Node c = new Node(o);
			c.next = top;
			top = c;
		}
	}
	public Object popAt(int index) {
		if (index < 0) return null;
		else if (index == 0) return pop();
				else return next.popAt(index - 1);
	}

}
