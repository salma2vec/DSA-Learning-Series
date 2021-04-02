import java.util.*;

public class Main {
    void Rotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotate(arr, n);
    }
 
    void leftRotate(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
 
    void display(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) throws Exception
    {
        Main Rotation = new Main();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("The resultant rotation yields the following array: \n");
        Rotation.Rotate(arr, 2, 9);
        Rotation.display(arr, 9);
    }
}
/* Output:
The resultant rotation yields the following array:                                                    
3 4 5 6 7 8 9 1 2  
*/