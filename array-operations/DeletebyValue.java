import java.util.Arrays;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("The number of elements in the array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0, k=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] new_arr = new int[arr.length-1];
        System.out.println("User, Enter the element to be deleted:");
        int j = sc.nextInt();
        for(int i=0, k=0; i<arr.length;i++){
            if(arr[i]!=j){
                new_arr[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(new_arr));
 
    }
}