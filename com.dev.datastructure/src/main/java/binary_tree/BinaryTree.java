package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    BinaryTree(Node root) {
        this.root = root;
    }

    public void printInOrder() {
        inOrder(root);

    }

    private void inOrder(Node temp) {
        if (temp != null) {
            inOrder(temp.lptr);
            System.out.print(temp.key + " ");
            inOrder(temp.rptr);
        }
    }

    void insert(Node root, int key) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            root = queue.peek();
            queue.remove();

            if (root.lptr == null) {
                root.lptr = new Node(key);
                break;
            } else {
                queue.add(root.lptr);
            }

            if (root.rptr == null) {
                root.rptr = new Node(key);
                break;
            } else {
                queue.add(root.rptr);
            }
        }
    }
}
