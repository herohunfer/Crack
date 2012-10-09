import java.util.*;
public class Q4_2 {
    public static void main (String [] args)
    {
        
    }
    public static boolean path(Graph g, Node start, Node end) {
        LinkedList<Node> q = new LinkedList<Node>();
        for (Node i : g.getNode())
            i.state = false;
        q.add(start);
        while (!q.isEmpty()) {
            Node u = q.removeFirst;
            for (Node i : u.getAdjacent()) {
                if (v.state == false) {    //not visited
                    v.state = true;
                    if (v == end) return true;
                    else q.add(v);
                }
            }
            u.state  = true;
        }
    }
}
