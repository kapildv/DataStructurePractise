package binary_search_tree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insertNode(int key) {
        root = insertNewNode(root, key);
    }

    private Node insertNewNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root = insertNewNode(root.lptr, key);
        } else if (key > root.key) {
            root = insertNewNode(root.rptr, key);
        }

        return root;
    }


}
