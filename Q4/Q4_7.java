import java.util.*;
public class Q4_7 {
    public static void main (String [] args)
    {
        
    }
    public static Node commonAncestor(Node root, Node p, Node q) {
        if (root == null) return null;
        if (root == p && root == q) return root;
        if (commonAncestor(root.left, p, q) == null) return 
    }
}
