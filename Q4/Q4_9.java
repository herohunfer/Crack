import java.util.*;
public class Q4_9 {
    public static void main (String [] args)
    {
        
    }
    public static void findPath(Node root, int sum) {
        int depth = depth(root);
        int [] path = new int[depth];
        findPath(root, sum, 0);
    }
    public static void findPath(Node n, int sum, int [] p, level) {
        if (node == null) return;
        path[level] = n.data;
        int t = 0;
        for (int i = level; i >=0; i--) {
            t += path[i];
            if (t == sum) printPath(p, i, level);
        }
        findPath(n.left, sum, p, level+1);
        findPath(n.right, sum, p, level+1);

        p[level] = Integer.MIN_VALUE;
    }
    public static int depth(Node root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right))+1;
    }
    public static void printPath(int [] p, int i, int l) {
        for (int j = i; j <= l; j++)
            System.out.print(path[i] + " ");
        System.out.println();
    }
}
