## Q) Find if the balanced expression contains duplicate parenthesis or not.
**To be noted: A set of parenthesis are duplicate if the same subexpression is surrounded by multiple parenthesis.**
### Algorithm
1. Initialize a string expression containing balanced parenthesis.
2. Initialize a stack.
3. Traverse the given string.
4. Check for each character :- If it is equal to ‘(‘ or any operator or operand, push it to the the stack.
5. Else, if it is equal to ‘)’, pop the characters until the open parenthesis of same kind is found.
6. Using a count variable, increment it for every character till the opening parenthesis ‘(‘ is found.
7. If the variable count is less than 1, then return true (i.e Yes- 'There are duplicate parenthesis found in this expression' and the like). 
8. Else, return false i.e print 'There is no duplicate parenthesis found'.

### Code

  
    static boolean isDuplicate(String s){ 
        
        Stack<Character> Stack = new Stack<>(); 
  
        char[] string = s.toCharArray(); 
        for(char ch : string) { 
            
            if (ch == ')') { 
                
                char top = Stack.peek(); 
                Stack.pop(); 
  
                int el = 0; 
                
                while (top != '(') { 
                    el++; 
                    top = Stack.peek(); 
                    Stack.pop(); 
                } 
                
                if (el < 1){ 
                    return true; 
                } 
            } 
            
            else{ 
                Stack.push(ch); 
            } 
        } 
  
        return false; 
    } 
  
    public static void main(String[] args) throws Exception
    { 
  
        String str = "(((x+(y))+z))"; 
  
        if(isDuplicate(str)){ 
            System.out.println("The following expression does indeed contain duplicate parenthesis."); 
        } 
        
        else{ 
            System.out.println("The following expression does not contain duplicate parenthesis."); 
        } 
  
    } 

### Output
The following expression does indeed contain duplicate parenthesis.

### Time Complexity: O(n)
