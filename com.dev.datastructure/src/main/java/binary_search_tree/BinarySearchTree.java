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
        if (root.key > key) {
            root.lptr = insertNewNode(root.lptr, key);
        } else if (root.key < key) {
            root.rptr = insertNewNode(root.rptr, key);
        }
        return root;
    }

    public void printTree() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.lptr);
            System.out.print(root.key + " ");
            inOrder(root.rptr);
        }
    }

}
