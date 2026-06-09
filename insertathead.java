import java.util.Arrays;
import java.util.List;

public class insertathead {
    public static class Node{
        int data;
        Node next;

        //construct with both data and next node
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;

    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node addFirst(Node head , int val){
        //create a new node at head 
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }
    public static void main(String[] args) {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        // Inserting a new node at the head of the linked list
        head = addFirst(head, val);
        printLL(head);

}
}

