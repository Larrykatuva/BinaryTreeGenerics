public class BinaryTree<T> {

    public Node root;

    public void addNode(int key, T data){
        Node newNode = new Node(key, data);
        if(this.root == null){
            this.root = newNode;
        }else{
            Node focusNode = this.root;
            Node parent;
            while(true){
                parent = focusNode;
                if(key < focusNode.getKey()){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraversal(Node rootNode){
        if(rootNode != null){
            this.inOrderTraversal(rootNode.leftChild);
            rootNode.printData();
            this.inOrderTraversal(rootNode.rightChild);
        }
    }

    public void preOrderTraversal(Node rootNode){
        if(rootNode != null){
            rootNode.printData();
            this.preOrderTraversal(rootNode.leftChild);
            this.preOrderTraversal(rootNode.rightChild);
        }
    }
}
