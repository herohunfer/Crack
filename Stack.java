class Stack {
	Node top;
	Object data;
	Object pop() {
		if (top != null) {
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}
	void push(Object item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	String toString() {
		Node temp = top;
		while (temp != null)
			return "data = "+ data.toString() + "\n"
					+ temp.next.toString();
	}
}
