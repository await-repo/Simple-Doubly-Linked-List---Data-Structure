public class Node {

    int number;
    /*El nodo next apunta al nodo que esta despues*/
    Node next;
    /*El nodo prev apunta al nodo que esta antes*/
    Node prev;

    public Node(){

    }

    public Node(int number){
        this.number = number;
        this.next = null;
        this.prev = null;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Node{ number=" + number + ", next=" + next + " } ";
    }
}
