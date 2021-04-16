// Infix to Postfix Conversion program in Java using stack.
/* 
Algorithm to evaluate postfix expression
1. Read a character
2. If the character is a digit, convert the character into int and push the integer into the stack.
3. If the character is an operator,
4. Pop the elements from the stack twice obtaining two operands.
5. Perform the operation
6. Push the result into the stack.
*/

/*
Rules for the conversion from infix to postfix expression

- Print the operand as they arrive.
- If the stack is empty or contains a left parenthesis on top, push the incoming operator on to the stack.
- If the incoming symbol is '(', push it on to the stack.
- If the incoming symbol is ')', pop the stack and print the operators until the left parenthesis is found.
- If the incoming symbol has higher precedence than the top of the stack, push it on the stack.
- If the incoming symbol has lower precedence than the top of the stack, pop and print the top of the stack. Then test the incoming operator against the new top of the stack.
- If the incoming operator has the same precedence with the top of the stack then use the associativity rules. If the associativity is from left to right then pop and print the top of the stack then push the incoming operator. If the associativity is from right to left then push the incoming operator.
- At the end of the expression, pop and print all the operators of the stack.
*/



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
