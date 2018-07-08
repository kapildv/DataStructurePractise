package graph.bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class BfsGraph {
    private int V;
    private LinkedList adj[];


    BfsGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void bfs(int source) {
        boolean isVisited[] = new boolean[V];
        isVisited[source] = true;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            source = queue.poll();
            System.out.print(source + " ");

            Iterator<Integer> iterator = adj[source].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    queue.add(next);
                }
            }
        }


    }
}
