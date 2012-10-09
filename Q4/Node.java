public class Node {
    int data;
    Node left;
    Node right;
    public Node() {
        left = null;
        right = null;
        data = 0;
    }
    public Node(int d) {
        left = null;
        right = null;
        data = d;
    }
    public Node(Node l, Node r, int d) {
        left = l;
        right = l;
        data = d;
    }
}
