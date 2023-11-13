import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
    static class Node {
        int data;
        Node left, right;
 
        public Node(int key) {
            data = key;
            left = right = null;
        }
    }
 
    static void preorder(Node Node) {
        if (Node == null)
            return;
 
        // Traverse root
        System.out.print(Node.data + " ");
        // Traverse left
        preorder(Node.left);
        // Traverse right
        preorder(Node.right);
    }
 
    static void inorder(Node Node) {
        if (Node == null)
            return;
 
        // Traverse left
        inorder(Node.left);
        // Traverse root
        System.out.print(Node.data + " ");
        // Traverse right
        inorder(Node.right);
    }
 
    static void postorder(Node Node) {
        if (Node == null)
            return;
 
        // Traverse left
        postorder(Node.left);
        // Traverse right
        postorder(Node.right);
        // Traverse root
        System.out.print(Node.data + " ");
    }
   static void print(Node root) {
       Queue<Node> queue = new LinkedList<Node>();
       queue.add(root);
       while (!queue.isEmpty()) {
           Node tempNode = queue.poll();
           System.out.print(tempNode.data + " ");
 
           /*add left child to the queue */
           if (tempNode.left != null) {
               queue.add(tempNode.left);
           }
 
           /*add right right child to the queue */
           if (tempNode.right != null) {
               queue.add(tempNode.right);
           }
       }
   }
 
    public static void main(String args[])
             
    {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        System.out.println("Inorder traversal: ");
        inorder(root);
 
        System.out.println("\nPreorder traversal: ");
        preorder(root);
 
        System.out.println("\nPostorder traversal: ");
       postorder(root);
 
        System.out.println("\nLevel order traversal: ");
        print(root);
 
    }
 
} 


/* Output:
Inorder traversal:                                                                                    
3 1 4 0 2                                                                                             
Preorder traversal:                                                                                   
0 1 3 4 2                                                                                             
Postorder traversal:                                                                                  
3 4 1 2 0                                                                                             
Level order traversal:                                                                                
0 1 2 3 4                                                                                             
              
*/
