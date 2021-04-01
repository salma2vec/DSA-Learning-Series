import java.util.*;

public class Main {

    static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostFix(String str){

        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            //check if char is operator
            if(precedence(ch)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(ch)){
                    result += stack.pop();
                }
                stack.push(ch);
            }else if(ch==')'){
                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();
                }
            }else if(ch=='('){
                stack.push(ch);
            }else{
                result += ch;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Infix Expression: ");
        String exp = sc.nextLine();
        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + infixToPostFix(exp));
    }
}
