import java.util.*;

class AVLNode

{

    AVLNode left, right;

    int data;

    int height;

    public AVLNode()

    {

        left = null;

        right = null;

        data = 0;

        height = 0;

    }

    public AVLNode(int n)

    {

        left = null;

        right = null;

        data = n;

        height = 0;

    }

}


class AVLTree

{

    private AVLNode root;

    public AVLTree()

    {

        root = null;

    }


    public boolean isEmpty()

    {

        return root == null;

    }


    public void makeEmpty()

    {

        root = null;

    }


    public void insert(int data)

    {

        root = insert(data, root);

    }

    private int height(AVLNode t )

    {

        return t == null ? -1 : t.height;

    }

    private int max(int lhs, int rhs)

    {

        return Math.max(lhs, rhs);

    }


    private AVLNode insert(int x, AVLNode t)

    {

        if (t == null)

            t = new AVLNode(x);

        else if (x < t.data)

        {

            t.left = insert( x, t.left );

            if( height( t.left ) - height( t.right ) == 2 )

                if( x < t.left.data )

                    t = rotateWithLeftChild( t );

                else

                    t = doubleWithLeftChild( t );

        }

        else if( x > t.data )

        {

            t.right = insert( x, t.right );

            if( height( t.right ) - height( t.left ) == 2 )

                if( x > t.right.data)

                    t = rotateWithRightChild( t );

                else

                    t = doubleWithRightChild( t );

        }

        else

            ;

        t.height = max( height( t.left ), height( t.right ) ) + 1;

        return t;

    }

    private AVLNode rotateWithLeftChild(AVLNode k2)

    {

        AVLNode k1 = k2.left;

        k2.left = k1.right;

        k1.right = k2;

        k2.height = max( height( k2.left ), height( k2.right ) ) + 1;

        k1.height = max( height( k1.left ), k2.height ) + 1;

        return k1;

    }



    private AVLNode rotateWithRightChild(AVLNode k1)

    {

        AVLNode k2 = k1.right;

        k1.right = k2.left;

        k2.left = k1;

        k1.height = max( height( k1.left ), height( k1.right ) ) + 1;

        k2.height = max( height( k2.right ), k1.height ) + 1;

        return k2;

    }


    private AVLNode doubleWithLeftChild(AVLNode k3)

    {

        k3.left = rotateWithRightChild( k3.left );

        return rotateWithLeftChild( k3 );

    }


    private AVLNode doubleWithRightChild(AVLNode k1)

    {

        k1.right = rotateWithLeftChild( k1.right );

        return rotateWithRightChild( k1 );

    }


    public int countNodes()

    {

        return countNodes(root);

    }

    private int countNodes(AVLNode r)

    {

        if (r == null)

            return 0;

        else

        {

            int l = 1;

            l += countNodes(r.left);

            l += countNodes(r.right);

            return l;

        }

    }

    public boolean search(int val)

    {

        return search(root, val);

    }

    private boolean search(AVLNode r, int val)

    {

        boolean found = false;

        while ((r != null) && !found)

        {

            int rval = r.data;

            if (val < rval)

                r = r.left;

            else if (val > rval)

                r = r.right;

            else

            {

                found = true;

                break;

            }

            found = search(r, val);

        }

        return found;

    }


    public void inorder()

    {

        inorder(root);

    }

    private void inorder(AVLNode r)

    {

        if (r != null)

        {

            inorder(r.left);

            System.out.print(r.data +" ");

            inorder(r.right);

        }

    }


    public void preorder()

    {

        preorder(root);

    }

    private void preorder(AVLNode r)

    {

        if (r != null)

        {

            System.out.print(r.data +" ");

            preorder(r.left);

            preorder(r.right);

        }

    }


    public void postorder()

    {

        postorder(root);

    }

    private void postorder(AVLNode r)

    {

        if (r != null)

        {

            postorder(r.left);

            postorder(r.right);

            System.out.print(r.data +" ");

        }

    }

}


public class Main

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        AVLTree avlt = new AVLTree();



        System.out.println("------------------AVL Tree Implementation----------------\n");

        char ch;

        do

        {

            System.out.println("\nUser, Let's go ahead and try some of the AVL Tree Operations!\n");

            System.out.println("1. Insert. ");

            System.out.println("2. Search. ");

            System.out.println("3. Count nodes. ");

            System.out.println("4. Check if empty.");

            System.out.println("5. Clear tree.");

            int choice = sc.nextInt();

            switch (choice)

            {

                case 1 :

                    System.out.println("Enter an integer element to insert: ");

                    avl.insert( sc.nextInt() );

                    break;

                case 2 :

                    System.out.println("Enter an integer element to search for: ");

                    System.out.println("Search result: "+ avl.search( sc.nextInt() ));

                    break;

                case 3 :

                    System.out.println("Nodes: "+ avl.countNodes());

                    break;

                case 4 :

                    System.out.println("Empty status: "+ avl.isEmpty());

                    break;

                case 5 :

                    System.out.println("\nTada! Tree Cleared.");

                    avl.makeEmpty();

                    break;

                default :

                    System.out.println("Beep. Beep. Wrong Entry. \n ");

                    break;

            }


            System.out.print("\nPost-order: ");

            avl.postorder();

            System.out.print("\nPre-order: ");

            avl.preorder();

            System.out.print("\nIn-order: ");

            avl.inorder();



            System.out.println("\nDo you want to continue? (Type y or n) \n");

            ch = sc.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');

    }
