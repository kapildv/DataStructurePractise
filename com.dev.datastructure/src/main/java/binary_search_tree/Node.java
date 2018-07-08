package binary_search_tree;

public class Node {

    Node lptr, rptr;
    int key;

    public Node(int key) {
        this.key = key;
        lptr = rptr = null;
    }
}
