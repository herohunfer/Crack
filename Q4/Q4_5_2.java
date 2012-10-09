import java.util.*;
public class Q4_5_2 {
    public static void main (String [] args)
    {
        int maximum = Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;
        Node root = new Node(2);
        root.left = new Node(0);
        root.left.right = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(3);
        System.out.println(checkBST(root, minimum, maximum));
    }
    public static boolean checkBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data < min || root.data > max) return false;
        if (!checkBST(root.left, min, root.data) || !checkBST(root.right, root.data+1, max))
            return false;
        return true;
    }
}
