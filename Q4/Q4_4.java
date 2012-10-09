import java.util.*;
public class Q4_4 {
    public static ArrayList<LinkedList<Node>> createLinkedList (Node root) {
        if (root == null) return null;
        ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
        LinkedList<Node> current = new LinkedList<Node>();
        current.add(root);

        while (current != null) {
            result.add(current);
            LinkedList<Node> parent = current;
            current = new LinkedList<Node>();
            for (Node i : parent) {
                if (i.left != null) current.add(i.left);
                if (i.right != null) current.add(i.right);
            }
        }
        return result;
    }
}
