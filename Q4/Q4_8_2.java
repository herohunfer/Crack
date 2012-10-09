import java.util.*;
public class Q4_8_2 {
    public static void main (String [] args)
    {
        Node r1 = new Node(2);
        r1.left = new Node(3);
        r1.left.left = new Node(4);

        Node r2 = new Node(3);
        r2.left = new Node(3);
        System.out.println(subtree(r1, r2));
    }
    public static boolean subtree(Node r1, Node r2) {
        //create r1 string
        String s1 = "", s2 = "";
        Stack<Node> r = new Stack<Node>();
        // check inorder
        Node current = r1;
        while (!r.isEmpty() || current != null) {
            if (current != null) {
                r.push(current);
                current = current.left;
            }
            else {
                current = r.pop();
                s1 = s1 + current.data;
                current = current.right;
            }

        }
        current = r2;
        while (!r.isEmpty() || current != null) {
            if (current != null) {
                r.push(current);
                current = current.left;
            }
            else {
                current = r.pop();
                s2 = s2 + current.data;
                current = current.right;
            }
        }
        if (isSubString(s1, s2)) {
            //check preorder
            s1 = "";
            s2 = "";
            r.push(r1);
            while (!r.isEmpty()) {
                current = r.pop();
                s1 = s1 + current.data;
                if (current.right != null) r.push(current.right);
                if (current.left != null) r.push(current.left);
            }
            r.push(r2);
            while (!r.isEmpty()) {
                current = r.pop();
                s2 = s2 + current.data;
                if (current.right != null) r.push(current.right);
                if (current.left != null) r.push(current.left);
            }
            if (isSubString(s1, s2)) return true;
        }
        return false;
    }
    public static boolean isSubString(String a, String b) {
        // return if b is a substring of a
        return a.toLowerCase().contains(b.toLowerCase());
    }
}
