public class Node<T> {

    private int key;
    private T data;
    public Node<T> leftChild;
    public Node<T> rightChild;

    public Node(int key, T data){
        this.key = key;
        this.data = data;
    }

    public int getKey(){
        return this.key;
    }

    public T getData(){
        return this.data;
    }

    public void printData(){
        System.out.println("Key => "+this.key+" data => "+this.getData());
    }
}
