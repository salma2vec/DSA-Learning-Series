import java.util.*;

public class Main
{
static class Node 
{
    char data;
    Node prev;
    Node next;
};

static int size(Node head)
{
    Node curr = head;
    int size = 0;
    while (curr != null)
    {
        curr = curr.next;
        size++;
    }
    return size;
}
  
static void print(Node node)
{
    while (node.next != null) 
    {
        System.out.print(node.data + " <=> ");
        node = node.next;
    }
    System.out.print(node.data);
}

static Node push(Node head, char new_data)
{
    Node new_node = new Node();
    new_node.data = new_data;
    new_node.prev = null;
    new_node.next = head;
    if (head != null)
        head.prev = new_node;
    head = new_node;
    return head;
}
  
static Node rotate(Node head, 
                   int K, int size)
{

    K = K % size;

    K = size - K;
  
    if (K == 0)
        return null;
  
    Node current = head;

    int count = 1;
    while (count < K && current != null) 
    {
        current = current.next;
        count++;
    }
    if (current == null)
        return null;
        
    Node KthNode = current;
    
    while (current.next != null)
        current = current.next;
  
    current.next = head;

    head.prev = current;

    head = KthNode.next;

    head.prev = null;

    KthNode.next = null;
    return head;
}
  

public static void main(String[] args) throws Exception
{
    Node head = null;

    head = push(head, 'e');
    head = push(head, 'd');
    head = push(head, 'c');
    head = push(head, 'b');
    head = push(head, 'a');
  
    int K = 3;
  
    // Length of the list
    int size = size(head);
  
    System.out.println("The given Doubly linked list is as follows: ");
    print(head);
    head = rotate(head, K, size);
  
    System.out.println("\nThe clockwise Rotated Linked list: ");
    print(head);
}
}

/*
Output:

The given Doubly linked list is as follows:                                                           
a <=> b <=> c <=> d <=> e                                                                             
The clockwise Rotated Linked list:                                                                    
c <=> d <=> e <=> a <=> b 
*/
