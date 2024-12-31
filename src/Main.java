//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();


        // Adding keys to the BST as per the given figure
        bst.add(56); // Root node
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(16);
        bst.add(3);
        bst.add(65);
        bst.add(63);
        bst.add(67);

// Printing the tree in-order
        System.out.println("In-order traversal of the BST:");
        bst.printInOrder();

        // Checking the size of the tree
        System.out.println("Size of the BST: " + bst.size());

        // Searching for the key 63
        System.out.println("Is 63 present in the BST? " + bst.search(63));
    }
}