//Code for the Concatenation of 2 Linked Lists in Java.

import java.util.*;

import static java.lang.System.out;

 
public class Main 
{
  
public node head = null;
  
 
class node 
  {
    
int data;
    
node next;
    
 
public node (int data) 
    {
      
this.data = data;
      
this.next = null;
  
} 
} 
public void beginning (int newData) 
  {
    
node newnode = new node (newData);
    
if (head == null)
      
 
 
      {
	
head = newnode;
      
 
 
}
    
    else
      
      {
	
 
 
newnode.next = head;
	
 
 
head = newnode;
      
 
 
}
  
 
 
}
  
 
public void end (int d) 
  {
    
node tail = head;
    
 
if (tail == null)
      
      {
	
System.out.println ("Beep. Beep. No elements present.");
      
}
    
while (tail.next != null)
      
      {
	
tail = tail.next;
      
 
}
    
 
node newone = new node (d);
    
tail.next = newone;
    
tail = newone;
  
 
 
}
  
 
public void specific (int data, int pos) 
  {
    
 
node newNode = new node (data);
    
 
node current = this.head, prev = this.head;
    
 
 
 
 
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
  
public void print () 
  {
    
if (this.head == null)
      
      {
	
out.println ("Beep. Beep. The List is empty.");
      
 
 
}
    
    else
      
      {

node current = this.head;
	
while (current != null)
	  
	  {
	    
out.print (current.data + " -> ");
	    
current = current.next;
	  
}
	
out.println ("NULL.\n");
      
}
  
 
}
  
public node tail_of_list1 () 
  {
    
node temp = head;
    
while (temp.next != null)
      
 
 
temp = temp.next;
    
return temp;
  
 
 
}
  
 
public node head_of_list2 () 
  {
    
return head;
  
 
 
}
  
 
public void concatenate (node tail, node head2) 
  {
    
 
tail.next = head2;
    
node temp = head;
    
while (temp != null)
      
      {
	
out.print (temp.data + " ");
	
temp = temp.next;
      
}
  
 
}
  
 
public static void main (String[]args) throws Exception 
  {
    
Main list = new Main ();
    
Main obj = new Main ();
    

list.beginning (3);
    
list.end (6);
    
list.end (9);
    
list.end (33);
    
list.end (999);
    
out.println ("The contents of 1st List are as follows: ");
    
list.print ();
    
obj.beginning (5);
    
obj.end (25);
    
obj.end (100);
    
obj.end (125);
    
obj.end (625);
    
out.println ("The contents of 2nd List are as follows: ");
    
obj.print ();
    
out.println ("The concatenated list is as follows...Voilà! ");
    
list.concatenate (list.tail_of_list1 (), obj.head_of_list2 ());
    
out.println ("\n--------------SALMA--------------");

} 
} 

/*Output-

The contents of 1st List are as follows:                                                              
3 -> 6 -> 9 -> 33 -> 999 -> NULL.                                                                     
                                                                                                      
The contents of 2nd List are as follows:                                                              
5 -> 25 -> 100 -> 125 -> 625 -> NULL.                                                                 
                                                                                                      
The concatenated list is as follows...Voilà!                                                        
3 6 9 33 999 5 25 100 125 625                                                                         
--------------SALMA--------------  
