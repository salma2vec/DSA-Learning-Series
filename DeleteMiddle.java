import java.util.*;
import static java.lang.System.out;

public class Main{ 
    static void deleteMiddle(Stack<Character> st, int n, int curr){ 
        if(st.empty() || curr == n){ 
            return; 
        }
        char x = st.pop(); 
        deleteMiddle(st, n, curr+1); 
        if(curr != n/2){ 
            st.push(x); 
        }
    } 
    public static void main(String args[]) throws Exception{
        Stack<Character> st = new Stack<Character>(); 
        st.push('7'); 
        st.push('5'); 
        st.push('4'); 
        st.push('3'); 
        st.push('2'); 
        st.push('1'); 
        
        deleteMiddle(st, st.size(), 0); 
      
        while(!st.empty()){ 
            char p= st.pop(); 
            System.out.print(p + " "); 
        } 
    } 
}

/*Output:
1 2 3 5 7 
*/
