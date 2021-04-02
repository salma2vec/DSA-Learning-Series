import java.util.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        int n, el, flag = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Input the elements of the array: ");
        for(i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Input the element to search the array for: ");
        el = sc.nextInt();
        for(i = 0; i < n; i++)
        {
            if(arr[i] == el)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position: "+ (i + 1)+ " (*-*)");
        }
        else
        {
            System.out.println("Element not found. (-.-)");
        }
    }
}