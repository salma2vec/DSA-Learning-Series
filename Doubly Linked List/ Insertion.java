import java.util.*;
public class Main {  
  
    class Node{  
        int data;  
        Node prev;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
        }  
    }  

    Node head, tail = null;  
    public void add(int data) {  
        Node newNode = new Node(data);  
  
        if(head == null) {  
            head = tail = newNode;  
            head.prev = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("Beep. Beep. The List is empty.");  
            return;  
        }  
        System.out.println("The Doubly Linked List is as follows: ");  
        while(current != null) {  
  
            System.out.print(current.data + " <-> ");  
            current = current.next;  
        }
    System.out.print("NULL.");    
    }  
      
    public static void main(String[] args) throws Exception {  
          
        Main DoublyLL = new Main();  
        DoublyLL.add(1);  
        DoublyLL.add(2);  
        DoublyLL.add(3);  
        DoublyLL.add(4);  
        DoublyLL.add(5);
        DoublyLL.display();  
    }  
} 

/* Output:
The Doubly Linked List is as follows: 
1 <-> 2 <-> 3 <-> 4 <-> 5 <-> NULL.
*/
