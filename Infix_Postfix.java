//Infix to Postfix Conversion program in Java using stack.

import java.util.*;
import static java.lang.System.out;

public class Main
{
  
 
static char postfix[] = new char[50];
  
static String infix = new String();
  
static int i, top, k;
  
static char stack[] = new char[30];
  
public static void main(String args[]) throws Exception 
  {
    
Scanner sc = new Scanner(System.in);
    
out.println("User, Go ahead & Enter the Infix Notation: ");
    
infix = sc.nextLine();
    
push('#');
    
k = 0;
    
sc.close();
    
for (int i = 0; i < infix.length(); i++)
      
      {
	
if (infix.charAt(i) == '(')
	  
	  {
	    
push (infix.charAt(i));
	  
}
	
	else
	  
	  {
	    
if (infix.charAt (i) >= 'a' & infix.charAt (i) <= 'z'
		 || infix.charAt (i) >= '0' & infix.charAt (i) <= '9'
		 || infix.charAt (i) >= 'A' & infix.charAt (i) <= 'Z')
	      
	      {
		
postfix[k++] = infix.charAt (i);
		
out.println (infix.charAt(i));
	      
}
	    
	    else
	    
if (infix.charAt(i) == ')')
	      
	      {
		
while (stack[top] != '(')
		  
postfix[k++] = pop();
		
 
char elem = pop();	
  /* Remove ( */
	      
}
	    
	    else
	      
	      {			
        /* Operator */
		
out.println (stack[top] + " " + infix.charAt(i));
		
while (pr (stack[top]) >= pr (infix.charAt(i)))
		  
postfix[k++] = pop();
		
push(infix.charAt(i));
	      
}
	  
}
      
}
    
 
while (stack[top] != '#')
      
      {				
  /* Pop from stack till empty */
	
postfix[k++] = pop();
	
	  /* Make postfix as valid string */ 
      
}
    
out.println ("The Postfix of the given is:");
out.println ("-----------------------------");

for (i = 0; i < k; i++)
      
out.print(postfix[i]);
out.println("\n------------------------------");
out.print("\nSalma has successfully converted... Infix -> Postfix! (^-^)");
  
}
  
public static void push(char elem) 
  {				
  /* Function for PUSH operation */
    
stack[++top] = elem;
  
} 
public static char pop() 
  {				
  /* Function for POP operation */
    
return (stack[top--]);
  
}
  
public static int pr (char elem) 
  {
    
int r = 0;			
  /* Function for precedence */
    
switch (elem)
      
      {
      
case '#':
	r = 0;
	
break;
      
case '(':
	r = 1;
	
break;
      
case '+':
      
case '-':
	r = 2;
	
break;
      
case '*':
      
case '/':
	r = 3;
	
break;
      
}
    
return r;
  
}

 
}

/*Input & Output:

User, Go ahead & Enter the Infix Notation:                                                            
A+B*C+D                                                                                               
A                                                                                                     
# +                                                                                                   
B                                                                                                     
+ *                                                                                                   
C                                                                                                     
* +                                                                                                   
D                                                                                                     
The Postfix of the given is:                                                                          
-----------------------------                                                                         
ABC*+D+                                                                                               
------------------------------                                                                        
                                                                                                      
Salma has successfully converted... Infix -> Postfix! (^-^) 
*/
