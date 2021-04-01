import java.util.*;
public class Main {
 static String str= new String();
 static char rev[]= new char[50];
 static int top;
 public static void main(String args[])
 {
 top=-1;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the string to reverse: ");
 str= sc.nextLine();
 for(int i=0;i<str.length();i++)
 {
 push(str.charAt(i));
 }
 System.out.println("String after reversal: ");
 for(int i=top;i>=0;i--)
 {
 pop();
 }
 sc.close();
 }
 public static void push(char ch)
 {
 top++;
 rev[top]=ch;
 }
 public static void pop()
 {
 System.out.print(rev[top]);
 top--;
 }
}
/* Output:

Enter the string to reverse:                                                                                                                 
Salma greets you.                                                                                                                            
String after reversal:                                                                                                                       
.uoy steerg amlaS  
*/
