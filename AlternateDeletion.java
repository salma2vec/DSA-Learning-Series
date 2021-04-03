import java.util.*;
import static java.lang.System.out;

public class Main
{
    Node head;  
    class Node
    {
        int data;
        Node next;
        Node(int d) 
        {
            data = d; 
            next = null; 
            
        }
    }
 
    void AlternateDelete()
    {
       if (head == null)
          return;
 
       Node prev = head;
       Node cur = head.next;
 
       while (prev != null && cur != null)
       {          
           prev.next = cur.next;
           cur = null;
 
           prev = prev.next;
           if (prev != null)
              cur = prev.next;
       }
    }                

    public void insert(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void print()
    {
        Node temp = head;
        while(temp != null)
        {
           out.print(temp.data + " -> ");
           temp = temp.next;
        } 
        out.println("NULL.");
    }
    public static void main(String args[]) throws Exception
    {
        Main LL = new Main();
        LL.insert(3);
        LL.insert(6);
        LL.insert(9);
        LL.insert(33);
        LL.insert(99);
        LL.insert(333);
        LL.insert(999);
         
        out.println("The given Singly Linked List: ");
        LL.print();
         
        LL.AlternateDelete();
         
        out.println("After alternate deletion, the result is the following Singly Linked List: ");
        LL.print();
    }
}
/*
Output:

The given Singly Linked List:                                                                         
999 -> 333 -> 99 -> 33 -> 9 -> 6 -> 3 -> NULL.                                                        
After alternate deletion, the result is the following Singly Linked List:                             
999 -> 99 -> 9 -> 3 -> NULL. 
*/
