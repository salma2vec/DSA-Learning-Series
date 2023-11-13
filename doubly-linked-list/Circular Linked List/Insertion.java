import java.util.*;
import static java.lang.System.out;

public class Main
{
 
static Node head;
 
static class Node
{
    int data;
    Node next;
    Node prev;
};
 
// Function to insert at the end
static void insertAtEnd(int value)
{
    // If the list is empty, create a single node
    // circular and doubly list
    if (head == null)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = newNode.prev = newNode;
        head = newNode;
        return;
    }

    Node last = (head).prev;

    Node newNode = new Node();
    newNode.data = value;

    newNode.next = head;
 
    (head).prev = newNode;

    newNode.prev = last;

    last.next = newNode;
}
 

static void insertAtBeginning(int value)
{
    Node last = (head).prev;
 
    Node newNode = new Node();
    newNode.data = value;
 

    newNode.next = head;
    newNode.prev = last;

    last.next = (head).prev = newNode;
 

    head = newNode;
}
 
static void insertNext(int val1,int val2)
{
    Node newNode = new Node();
    newNode.data = val1;
 
    Node temp = head;
    while (temp.data != val2)
        temp = temp.next;
    Node next = temp.next;
 
    temp.next = newNode;
    newNode.prev = temp;
    newNode.next = next;
    next.prev = newNode;
}
 
static void display()
{
    Node temp = head;
 
    out.println("\nWhen traversing in the forward direction: \n");
    while (temp.next != head)
    {
        out.print(temp.data+" <-> ");
        temp = temp.next;
    }
    out.print(temp.data +" <-> ");
    out.print("NULL.");   
 
    out.println("\nWhen traversing in the reverse direction: \n");
    Node last = head.prev;
    temp = last;
    while (temp.prev != last)
    {
        out.print(temp.data + " <-> ");
        temp = temp.prev;
    }
    out.print("NULL.");
}
 

public static void main(String[] args) throws Exception
{
    Node head = null;
    insertAtEnd(3);
    insertAtBeginning(1);
    insertAtEnd(4);
    insertAtEnd(5);
    insertNext(6, 1);
 
    out.println("The created circular doubly linked list is as follows:  ");
    display();
}
}


/* 
Output:

The created circular doubly linked list is as follows:                                             
                                                                                                   
When traversing in the forward direction:                                                          
                                                                                                   
1 <-> 6 <-> 3 <-> 4 <-> 5 <-> NULL.                                                                
When traversing in the reverse direction:                                                          
                                                                                                   
5 <-> 4 <-> 3 <-> 6 <-> NULL. 

*/
