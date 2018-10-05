package graph.bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class BfsGraphPractice {

    private int V;
    private LinkedList adj[];

    public BfsGraphPractice(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int vertex, int w) {
        adj[vertex].add(w);
    }

    public void bfs(int source) {
        boolean isVisisted[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        isVisisted[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            source = queue.poll();
            System.out.println(source);

            for (Integer next : (Iterable<Integer>) adj[source]) {
                if (!isVisisted[next]) {
                    isVisisted[next] = true;
                    queue.add(next);
                }
            }
        }

    }
}
