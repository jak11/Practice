import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by kumavatj on 3/23/17.
 */

class Graph{
    List<Integer> vertices[];
    Graph(int s){
        vertices = new LinkedList[s];
        for(int i=0; i< s; i++){
            vertices[i] = new LinkedList<>();
        }
    }
    void addEdge(int s, int w){
        vertices[s].add(w);
    }

    void BFS(int s){
        Queue<Integer> queue = new LinkedList<>() ;
        queue.add(s);
        boolean[] visited = new boolean[vertices.length];

        while (!queue.isEmpty()){
            s = queue.poll();
            System.out.println(s);
            visited[s] = true;
            for (int node: vertices[s]) {
                if(!visited[node]){
                    queue.add(node);
                    visited[node] = true;
                }
            }

        }
    }
}



public class GraphPractice {
    public static void main(String[] args){
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}
