import java.util.*;
public class Q4_3 {
    public static void main (String [] args)
    {
        creatBST(a, 0, a.length-1);
    }
    public static Node createBST(int [] a, int start, int end) {
        if (a == null) return null;
        if (start > end) return null;
        int middle = (start + end) / 2;
        Node current = new Node(createBST(a, start, middle-1),
                                createBST(a, middle+1, end), 
                                middle);
        return current;
    }
}
