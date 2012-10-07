import java.util.*;
public class Q2_4 {
	public static void main(String[] args) {
		Node a = new Node(3, new Node(1, new Node(5, null)));
		Node b = new Node(5, new Node(9, new Node(2, null)));
		Node temp = a;
		int an = 0, bn = 0;
		int factor = 1;
		while (temp != null) {
			an += temp.data*factor;
			factor *= 10;
			temp = temp.next;
		}
		temp = b;
		factor = 1;
		while (temp != null) {
			bn += temp.data*factor;
			factor *= 10;
			temp = temp.next;
		}
		int result = an + bn;
		Node res = new Node(result%10);
		result = result / 10;
		while (result != 0) {
			res = new Node(result%10, res);
			result = result / 10;
		}
		temp = res;
		while (temp != null) {
			System.out.println(temp.toString());
			temp = temp.next;
		}
	
	}
}
