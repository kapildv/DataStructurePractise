package graph.bfs;

public class BfsDriver {

    public static void main(String args[]) {
        BfsGraph graph = new BfsGraph(7);

        graph.addEdge(1, 4);
        graph.addEdge(1, 5);
        graph.addEdge(4, 3);
        graph.addEdge(4, 2);
        graph.addEdge(3, 2);
        graph.addEdge(3, 6);
        graph.addEdge(2, 6);

        graph.bfs(1);

        BfsGraphPractice practice= new BfsGraphPractice(7);
        practice.addEdge(1, 4);
        practice.addEdge(1, 5);
        practice.addEdge(4, 3);
        practice.addEdge(4, 2);
        practice.addEdge(3, 2);
        practice.addEdge(3, 6);
        practice.addEdge(2, 6);

        practice.bfs(1);


    }

}
