//A Java program to insert a node at a specific position in a singly linked list.
import java.util.*;

class Node {
    int data;
    Node next;
}
class SinglyLinkedList{
    private Node head;
    
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (this.head == null) {
            head = node;
            return;
        }
        
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    public void specificinsert(int data, int pos) {
        Node node = new Node();
        node.data = data;
        node.next = null;


        if (this.head == null) {
            
            if (pos != 0) {
                return;
            } 
            else 
            { 
                this.head = node;
            }
        }

        if (head != null && pos == 0) {
            node.next = this.head;
            this.head = node;
            return;
        }

        Node current = this.head;
        Node prev = null;

        int i = 0;

        while (i < pos) {
            prev = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        prev.next = node;
    }

    public void print() {
        if (this.head == null) {
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println("END.");
    }
}
    public class Main {

  public static void main(String[] args) throws Exception {
      SinglyLinkedList list = new SinglyLinkedList();
      list.insert(33);
      list.insert(66);
      list.insert(99);
      list.specificinsert(333, 3);
      list.print();
  }
}
 //Output: 
//33,66,99,333,END.
