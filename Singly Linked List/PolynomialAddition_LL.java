import java.util.*;
import static java.lang.System.out;
public class Main {
    private Node first = new Node(0, 0); 
    private Node last  = first;

    private static class Node {
        int coef;
        int exp;
        Node next;
        Node(int coef, int exp) {
            this.coef = coef;
            this.exp  = exp;
        }
    }
  
    private Main() { }


    public Main(int coef, int exp) {
        last.next = new Node(coef, exp);
        last = last.next;
    }

    public Main plus(Main b) {
        Main a = this;
        Main c = new Main();
        Node x = a.first.next;
        Node y = b.first.next;
        while (x != null || y != null) {
            Node t = null;
            if      (x == null)     
            { 
                t = new Node(y.coef, y.exp);  
                y = y.next; 
            }
            else if (y == null)     
            { 
                t = new Node(x.coef, x.exp);  
                x = x.next; 
            }
            else if (x.exp > y.exp) 
            { 
                t = new Node(x.coef, x.exp);  
                x = x.next; 
            } 
            else if (x.exp < y.exp) 
            { 
                t = new Node(y.coef, y.exp);  
                y = y.next; 
            } 

            else {
                int coef = x.coef + y.coef;
                int exp  = x.exp;
                x = x.next;
                y = y.next;
                if (coef == 0) continue;
                t = new Node(coef, exp);
            }
        
            c.last.next = t;
            c.last = c.last.next;
        }
        return c;
    }

    public String toString() {
        String s = "";
        for (Node x = first.next; x != null; x = x.next) {
            if      (x.coef > 0) s = s + " + " +   x.coef  + "x^" + x.exp;
            else if (x.coef < 0) s = s + " - " + (-x.coef) + "x^" + x.exp;
        }
        return s;
    }

    public static void main(String[] args) { 
        Main zero = new Main(0, 0);

        Main p1   = new Main(5, 4);
        Main p2   = new Main(4, 2);
        Main p3   = new Main(-8, 1);
        Main p4   = new Main(9, 0);
        Main p    = p1.plus(p2).plus(p3).plus(p4);  

        Main q1   = new Main(9, 3);
        Main q2   = new Main(-3, 2);
        Main q3   = new Main(-8, 0);
        Main q    = q1.plus(q2).plus(q3);                     

        Main r    = p.plus(q);
        out.println("p(x) =        " + p);
        out.println("q(x) =        " + q);
        out.println("p(x) + q(x) = " + r);

   }

}


/* 
Output:
p(x) =         + 5x^4 + 4x^2 - 8x^1 + 9x^0                                                            
q(x) =         + 9x^3 - 3x^2 - 8x^0                                                                   
p(x) + q(x) =  + 5x^4 + 9x^3 + 1x^2 - 8x^1 + 1x^0 
*/
