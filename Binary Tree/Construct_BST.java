/* Construct Binary Tree from Inorder and Postorder Traversal*/
import java.util.*:

public class Main
{

  public static class Node
  {
    int data;
    Node left;
    Node right;

    public Node (int data)
    {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public Node root;

  public Main ()
  {
    root = null;
  }

  public void insert (int data)
  {
    Node newNode = new Node (data);

    if (root == null)
      {
	root = newNode;
	return;
      }
    else
      {
	Node current = root, parent = null;

	while (true)
	  {

	    parent = current;

	    if (data < current.data)
	      {
		current = current.left;
		if (current == null)
		  {
		    parent.left = newNode;
		    return;
		  }
	      }
	    else
	      {
		current = current.right;
		if (current == null)
		  {
		    parent.right = newNode;
		    return;
		  }
	      }
	  }
      }
  }


  public Node minNode (Node root)
  {
    if (root.left != null)
      return minNode (root.left);
    else
      return root;
  }

  public Node deleteNode (Node node, int value)
  {
    if (node == null)
      {
	return null;
      }
    else
      {
	if (value < node.data)
	  node.left = deleteNode (node.left, value);

	else if (value > node.data)
	  node.right = deleteNode (node.right, value);


	else
	  {

	    if (node.left == null && node.right == null)
	      node = null;


	    else if (node.left == null)
	      {
		node = node.right;
	      }


	    else if (node.right == null)
	      {
		node = node.left;
	      }


	    else
	      {

		Node temp = minNode (node.right);

		node.data = temp.data;

		node.right = deleteNode (node.right, temp.data);
	      }
	  }
	return node;
      }
  }


  public void inorderTraversal (Node node)
  {


    if (root == null)
      {
	System.out.println ("Beep. Beep. The Tree is empty.");
	return;
      }
    else
      {

	if (node.left != null)
	  inorderTraversal (node.left);
	System.out.print (node.data + " ");
	if (node.right != null)
	  inorderTraversal (node.right);

      }
  }

  public static void main (String[] args)
  {

    Main bt = new Main();

    bt.insert (10);
    bt.insert (20);
    bt.insert (30);
    bt.insert (40);
    bt.insert (50);

    System.out.println ("Binary search tree after insertion: \n");

    bt.inorderTraversal (bt.root);

    Node deletedNode = null;
    System.out.println ("\n\nBinary search tree after deletion: \n");
    deletedNode = bt.deleteNode (bt.root, 50);

    deletedNode = bt.deleteNode (bt.root, 30);

    deletedNode = bt.deleteNode (bt.root, 10);
    bt.inorderTraversal (bt.root);


  }
}
/* 
Output:

Binary search tree after insertion: 

10 20 30 40 50 

Binary search tree after deletion: 

10 20 40 
*/
