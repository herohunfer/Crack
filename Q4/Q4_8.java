import java.util.*;
public class Q4_8 {
    public static void main (String [] args)
    {
        Node t1 = new Node(new Node(3), new Node(3), 1);
        System.out.println(t1.left.left);
        t1.left.left = new Node(3);
        System.out.println(t1.left.left);
        Node t2 = new Node(new Node(3), null, 3);
        System.out.println(subtree(t1, t2));
    }
    public static boolean subtree (Node t1, Node t2) {
        if (t2 == null) return true;
        if (t1 == null) return false;
        if (t1.data == t2.data) 
            if (matchtree(t1,t2)) return true;
        return (subtree(t1.left, t2) || subtree(t1.right, t2));
    }
    public static boolean matchtree(Node t1, Node t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.data == t2.data)
            return (matchtree(t1.left, t2.left) && matchtree(t1.right, t2.right));
        else return false;
    }
}
