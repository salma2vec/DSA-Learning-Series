import java.util.*;

public class Insertion
{
  public Node head = null;
  class Node
  {
    private int data;
    private Node next;

    public Node(int data)
    {
      this.data = data;
      this.next = null;
    }
  }

  public void addNodeAtTheBeginning(int data)
  {
    Node newNode = new Node(data);

    if (this.head == null)
      {
	this.head = newNode;
      }
    else
      {
	newNode.next = this.head;
	this.head = newNode;
      }
  }

  public void addNodeAtTheEnd(int data)
  {
    Node newNode = new Node (data);
    if (this.head == null)
      {
	this.head = newNode;
      }
    else
      {
	Node current = this.head;
	while (current.next != null)
	  {
	    current = current.next;
	  }
	current.next = newNode;

      }
  }

  public void add (int pos, int data)
  {
    Node newNode = new Node(data);
    Node current = this.head, prev = this.head;

    if (pos == 1)
      {
	newNode.next = head;
	this.head = newNode;
	return;
      }
    while (current.next != null && --pos > 0)
      {
	prev = current;
	current = current.next;
      }
    prev.next = newNode;
    newNode.next = current;
  }

  public void print()
  {
    if (this.head == null)
      {
	System.out.println("Beep. Beep. This List is empty.");
      }
    else
      {
	System.out.println("The Singly Linked List is as follows: ");
	Node current = this.head;
	while (current != null)
	  {
	    System.out.print(current.data + " -> ");
	    current = current.next;
	  }
	System.out.println("NULL.\n");
      }
  }

  public static void main (String[] args)
  {
    Insertion list = new Insertion();
    System.out.println("Created a singly linked list...Now, Insertion.");
    list.addNodeAtTheBeginning(10);
    list.print();
    list.addNodeAtTheBeginning (20);
    list.print();
    list.addNodeAtTheEnd(50);
    list.print();
    list.addNodeAtTheEnd(30);

    list.print();
    list.add(1, 40);
    list.print();
    list.add(4, 20);
    list.print();
    list.add(6, 40);
    list.print();
    System.out.println("~ SALMA (^.^) ");
  }
}
