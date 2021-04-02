import java.util.*;
import java.util.Arrays;
 public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] new_arr = new int[arr.length-1];
        System.out.println("User, Enter the index of the element to be deleted (P.S : FYI, It starts from 0):");
        int j = sc.nextInt();
        for(int i=0, k=0; i<arr.length; i++){
            if(i!=j){
                new_arr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(new_arr));
 
    }
}