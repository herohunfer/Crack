import java.util.*;
public class Q4_7 {
    public static void main (String [] args)
    {
        
    }
    public static boolean covers(node root, node p) {
        if (root == null) return false;
        if (root == p) return true;
        return (covers(root.left, p) || covers(root.right, p));
    }
    public static Node commonAncestor(Node root, Node p, Node q) {
        if (root == null) return null;
        boolean rlp = covers(root.left,p);
        boolean rrp = covers(root.right,p);
        boolean rlq = covers(root.left,q);
        boolean rrq = covers(root.right,q);
        if ((rlp && rrq)  || (rrp && rlq)) return root;
        if (rlp && rlq) return commonAncestor(root.left, p, q);
        if (rrp && rrq) return commonAncestor(root.right, p, q);
        if (root == p) if (rlq || rrq) return root;
        if (root == q) if (rlp || rrp) return root;
        return null;
    }
}
