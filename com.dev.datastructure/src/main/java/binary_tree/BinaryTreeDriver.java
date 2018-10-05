package binary_tree;

public class BinaryTreeDriver {

    public static void main(String[] args) {
        Node root = new Node(10);
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.insert(root, 13);
        binaryTree.insert(root, 15);
        binaryTree.insert(root, 9);
        binaryTree.insert(root, 5);
        binaryTree.insert(root, 7);
        binaryTree.insert(root, 12);
        binaryTree.insert(root, 11);
        binaryTree.insert(root, 19);
        binaryTree.insert(root, 17);
        binaryTree.insert(root, 16);

        binaryTree.printInOrder();


    }
}
