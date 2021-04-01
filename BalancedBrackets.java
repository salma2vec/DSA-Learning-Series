import java.util.*;
import static java.lang.System.out;
public class Main {
	
	char stack[]= new char[100];
	  int top= -1;
	  
	  public void push(char ch)
		 { 
		 top++;
		 stack[top]=ch;
		 out.println("Pushed "+ stack[top]);

		 }
		
		 
		 char pop()
		    {
		        if (top < 0) {
		            out.println("Stack Underflow.");
		            return 0;
		        }
		        else {
		            char x = stack[top--];
		            out.println(x +" popped from stack");
		            return x;
		        }
		    }
		 boolean isEmpty()
		    {
		        return (top < 0);
		    }
	
  static boolean areBracketsBalanced(String str)
  {

	  Main stack = new Main();
      for (int i = 0; i < str.length(); i++)
      {
          char x = str.charAt(i);

          if (x == '(' || x == '[' || x == '{')
          {
              stack.push(x);
              continue;
          }

          if (stack.isEmpty())
              return false;
          char check;
          switch (x) {
          case ')':
              check = stack.pop();
              if (check == '{' || check == '[')
                  return false;
              break;

          case '}':
              check = stack.pop();
              if (check == '(' || check == '[')
                  return false;
              break;

          case ']':
              check = stack.pop();
              if (check == '(' || check == '{')
                  return false;
              break;
          }
      }
      return (stack.isEmpty());
  }

  public static void main(String[] args) throws Exception
  {
      Scanner sc = new Scanner(System.in);
      out.println("Input the brackets to be checked for balanced pairs: ");
      String str = sc.nextLine();

      if (areBracketsBalanced(str))
          out.println("Balanced! (^-^)  ");
      else
          out.println("Not Balanced...(*-*) ");
  }
 
}
/*Output-
Input the brackets to be checked for balanced pairs:                                                                                           
{[][)()][{}}                                                                                                                                   
Pushed {                                                                                                                                       
Pushed [                                                                                                                                       
[ popped from stack                                                                                                                            
Pushed [                                                                                                                                       
[ popped from stack                                                                                                                            
Not Balanced...(*-*) 
*/
