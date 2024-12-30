public class BinarySearchTree <T extends Comparable<T>>{
    private MyBinaryNode<T> root;

    public void add(T key){
        root = addRecursively(root,key);

    }

    private MyBinaryNode<T> addRecursively(MyBinaryNode<T> current,T key){
        if(current==null){
            return new MyBinaryNode<>(key);


        }
        if(key.compareTo(current.key)<0){
            current.left= addRecursively(current.left,key);
        }else if(key.compareTo(current.key)>0){
            current.right= addRecursively(current.right,key);
        }
        return current;
    }

    public void printInOrder(){
        printInOrderRecursively(root);
        System.out.println();
    }

    private void printInOrderRecursively(MyBinaryNode<T> node){
        if(node!=null){
            printInOrderRecursively(node.left);
            System.out.print(node.key+ " ");
            printInOrderRecursively(node.right);
        }
    }

    public int size(){
        return sizeRecursively(root);
    }

    private int sizeRecursively(MyBinaryNode<T> node){
        if(node==null){
            return 0;
        }
        return 1+ sizeRecursively(node.left)+sizeRecursively(node.right);
    }
}
