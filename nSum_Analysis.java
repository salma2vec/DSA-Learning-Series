import java.util.*;
 
 public class Main {
    public static void main(String[] args) throws Exception {                                    // #Operations
        Scanner sc = new Scanner(System.in);
        System.out.println("Oke, Sum of 'n' natural numbers. Till when, User?");
        int num = sc.nextInt();                                                                 // n
        int sum = 0;                                                                            // 1

        for(int i = 1; i <= num; ++i)                                                           // n+1

            sum += i;                                                                           // n
        }

        System.out.println("The Sum is: " + sum);                                               // 1
    }
}
