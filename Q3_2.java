class Stack {
	Node top;
	Node minimum;
	Object pop() {
		Object item = top.data;
		top = top.next;
		return item;
	}
	void push(Object item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
		if (minimum == null) minimum = top
		else if (minimum.data > t.data) minimum = top;
	}
	Node min() {
		return minimum;
	}
}
