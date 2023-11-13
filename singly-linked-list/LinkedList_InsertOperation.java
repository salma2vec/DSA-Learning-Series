// Java program to insert a node at the beginning, end and at specific position in a singly linked list.

class Node {        // Node class
    int data;
    Node next;
    
    Node(int data){          // Constructor that can be accessed all throughout the code. No need to define repeatedly.
        this.data = data;
        next = null;        
    }
}

class SinglyLinkedList{
    Node head;
    
    public void insertBegin(int data) {
        Node node = new Node(data);
     
        if (head == null) {         // Makes the new node as head if list is initially empty
            head = node;
        }else{
            node.next = head;       // Adds node at the start if list is not empty
            head = node;
        }        
    }
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    public void insertEnd(int data){
        Node node = new Node(data);
        
        if(head==null) {insertBeg(data);}       // If list is empty, insertBeg() is called.
        
        else{
            Node temp = head;
            while (temp.next != null) {         // Adds new node at the end.
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------------

    public void specificInsert(int data, int pos) {     // Function to insert new node at specific position input by the user.
        Node node = new Node(data);
       
        if(head == null) {insertBeg(data);}      // If list is empty, insertBeg() is called.
        
        else{
            Node temp = head;
            for(int count=1; count < pos; count++){       // Else new node is added at the specified position.
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------------
        
    public void printList() {
        if (head == null) {
            System.out.println("List Empty !");
        }
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null.");
    }
        
}


    
public class Main {
    public static void main(String[] args) throws Exception {
      
        SinglyLinkedList list = new SinglyLinkedList();
      
        list.insertBegin(33);
        list.insertBegin(66);
        list.insertBegin(99);
        
        list.specificInsert(333, 3);
        
        list.insertEnd(77);
        list.insertEnd(500);
        
        list.specificInsert(420, 5);
        
        list.printList();
    }
}
    
    
// Output:
// 99 -> 66 -> 33 -> 333 -> 77 -> 420 -> 500 -> Null.
