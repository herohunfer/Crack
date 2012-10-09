import java.util.*;
public class Q4_5 {
    public static int largest = Integer.MIN_VALUE;
    public static void main (String [] args)
    {
       Node root = new Node(2);
       root.left = new Node(0);
       root.left.right = new Node(1);
       root.right = new Node(3);
        System.out.println(checkBST(root));
    }
    public static boolean checkBST(Node root) {
        if (root == null) return true;
        if (!checkBST(root.left)) return false;
        if (largest > root.data) return false;
        largest = root.data;
        if (!checkBST(root.right)) return false;
        return true;
    }
}
