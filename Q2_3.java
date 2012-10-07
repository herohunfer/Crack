import java.util.*;
class Q2_3 {
	public static void main(String[] args) {
		Node a = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		Node temp = a;
		Node b = a.next.next;
		del(b);
		while (temp != null) {
			System.out.println(temp.toString());	
			temp = temp.next;
		}
	}
	public static void del(Node n) {
		Node temp = n;
		while (temp.next.next != null) {
			temp.data = temp.next.data;
			temp = temp.next;
		}
		temp.data = temp.next.data;
		temp.next = null;
	}
}
