import java.util.*;
public class Node {
	Node next = null;
	Object data;
	public Node(Object d) {data = d;}
	public Node(Object d, Node next) { data = d; this.next = next;}
	void add(Object d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {n = n.next;}
			n.next = end;
	}
	void delete() {
		this.next = this.next.next;
	}
	public String toString()
	{
	 	return "data = "+ data.toString();
	}
}














