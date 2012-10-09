import java.util.*;
public class Q4_6 {
    public static void main (String [] args)
    {
        
    }
    public static Node findNext(Node i) {
        Node result = i;
        if (result == null) return null;

        if (result.parent == null || result.right != null) {
            result = result.right;
            if (result == null) return null;
            while (result.left != null) result = result.left;
            return result;
        }
        else {
        while (result.parent.right == result) {    
            result = result.parent;
            if (result.parent == null) return null;
        }
        return result.parent;
        }
}
