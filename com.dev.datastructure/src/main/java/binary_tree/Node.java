package binary_tree;

public class Node {
    Node lptr, rptr;
    int key;

    Node(int key) {
        this.key = key;
        lptr = rptr = null;
    }
}
