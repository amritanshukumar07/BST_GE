//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Adding keys to the BST
        bst.add(56); // Root node
        bst.add(30); // Left node
        bst.add(70); // Right node

        // Printing the tree in-order
        System.out.println("In-order traversal of the BST:");
        bst.printInOrder();
    }
}