import java.util.Scanner;

public class Main
{
  
public static void main (String[]args)
  
{
    
int n;
    
Scanner sc = new Scanner (System.in);
      System.out.print ("Enter the number of elements: ");
      
n = sc.nextInt ();
    
int[] arr = new int[50];
      
System.out.println ("Enter the elements of the array: ");
    
for (int i = 0; i < n; i++)
      
{
	
arr[i] = sc.nextInt();
      
}
    
System.out.println ("The Array elements are: ");

    for (int i = 0; i < n; i++)
      
{
	
System.out.print(arr[i]+" ");
      
}
  
}

}