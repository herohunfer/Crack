import java.util.*;
class Q2_1 {
	public static void main(String[] args)
	{
		Node head = new Node(1);
		Node temp = head;
		for (int i = 0; i < 10; i++)
		{
			temp.next = new Node(i);
			if (i % 3 == 0) temp.next.data = i - 2;
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();	
		Node first = head, second = head;
		while (first.next != null) {
			while (second.next != null) {
				if (first.data == second.next.data)
				second.delete();
				second = second.next;
				if (second == null) break;
			}
			first = first.next;
			second = first;
		}
		temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
