class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
    public static void main(String[] args) {
        Node NodeA = new Node(9);
        Node NodeB = new Node(4);
        Node NodeC = new Node(90);
        Node NodeD = new Node(23);
        Node NodeE = new Node(5);
        Node NodeF = new Node(89);
        NodeA.next = NodeB;
        NodeB.next = NodeC;
        NodeC.next = NodeD;
        NodeC.next = NodeD;
        NodeE.next = NodeF;
    }
}