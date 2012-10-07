import java.util.*;
public class Q2_5 {
	public static void main(String[] args) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		Node a = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		Node b = a.next.next;
		Node temp = a;
		while (temp.next != null)
			temp = temp.next;
		temp.next = b;
		temp = a;
		while (temp != null)
		{
			System.out.println(temp.toString());
			if (map.get(temp.data) == null)
				map.put(temp.data, true);
			else break;
			temp = temp.next;
		}
		System.out.println(temp.toString());
	}
}
