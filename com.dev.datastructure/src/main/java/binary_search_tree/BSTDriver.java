package binary_search_tree;

public class BSTDriver {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(30);
        bst.insertNode(20);
        bst.insertNode(10);
        bst.insertNode(50);
        bst.insertNode(60);
        bst.insertNode(40);

        bst.printTree();

    }
}
