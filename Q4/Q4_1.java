import  java.util.*;
public class Q4_1 {
    public static void main (String [] args)
    {
        Node root = new Node();
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        int h = balance(root);
        if (h == -1) System.out.println("Not Balanced");
        else System.out.println("Balanced, height = "+h);
    }   
    public static int balance(Node root) {
        if (root == null) return 0;
        int leftHeight = balance(root.left);
        if (leftHeight == -1)
           return -1;
        int rightHeight= balance(root.right);
        if (rightHeight == -1)
                return -1;
        else if (Math.abs(leftHeight-rightHeight) > 1) return -1;
        else return Math.max(leftHeight, rightHeight)+1;
    } 
}
