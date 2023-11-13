// The Java program to delete all prime nodes from the given doubly linked list. 

import java.util.*;

import static java.lang.System.out;


class Main
{

  static class Node
  {

    int data;

    Node prev, next;

  };


  static Node push (Node head, int data)
  {


    Node newNode = new Node ();

      newNode.data = data;


      newNode.prev = null;

      newNode.next = (head);


    if ((head) != null)

        (head).prev = newNode;

      (head) = newNode;

      return head;

  }


  static boolean isPrime (int n)
  {


    if (n > 0 && n <= 3)

      return true;

    if (n % 2 == 0 || n % 3 == 0)

      return false;


    for (int i = 5; i * i <= n; i = i + 6)

      if (n % i == 0 || n % (i + 2) == 0)

	return false;


    return true;

  }


  static Node delete (Node head, Node del)
  {


    if (head == null || del == null)

      return null;


    if (head == del)

      head = del.next;


    if (del.next != null)

      del.next.prev = del.prev;


    if (del.prev != null)

      del.prev.next = del.next;


    return head;

  }


  static Node deletePrime (Node head)
  {

    Node cur = head;

    Node next;


    while (cur != null)

      {

	next = cur.next;


	if (isPrime (cur.data))

	  delete (head, cur);

	cur = next;

      }

    return head;

  }



  static void print (Node head)
  {

    while (head != null)

      {

	out.print (head.data + " <-> ");

	head = head.next;

      }

    out.print ("NULL.");

  }



  public static void main (String args[]) throws Exception
  {

    Node head = null;


      head = push (head, 79);

      head = push (head, 33);

      head = push (head, 7);

      head = push (head, 37);

      head = push (head, 15);


      out.print ("The given doubly Linked List is as follows: \n");

      print (head);


      head = deletePrime (head);


      out.print ("\nAnd...The Modified List is as follows: \n");

      print (head);

  }
}

/*
Output:

The given doubly Linked List is as follows:                                                           
15 <-> 37 <-> 7 <-> 33 <-> 79 <-> NULL.                                                               
And...The Modified List is as follows:                                                                
15 <-> 33 <-> NULL.  
*/
