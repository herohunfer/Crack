import java.util.*;
class Q2_2 {
	static int counter = -1;
	public static void main(String[] args) {
		Node a = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		System.out.println(find(a,1).toString());
	}
	public static Node find(Node head, int n) {
		Node temp;
		if (head == null) {
			return null;
		}
		else temp = find(head.next, n);
		++counter;
		if (counter == n) 
			return head;
		else return temp;
	}
}
