import java.util.Scanner;

public class Main
{

  public static void main (String[]args)
  {

    int n, pos, x;

    Scanner sc = new Scanner (System.in);

      System.out.println ("Input the number of array elements: ");

      n = sc.nextInt ();

    int intArr[] = new int[n + 1];

      System.out.println ("Enter the array elements : ");

    for (int i = 0; i < n; i++)
      {

	intArr[i] = sc.nextInt ();

      }
    System.out.println ("Array elements before insertion : ");

    for (int i = 0; i < n; i++)
      {

	System.out.print (intArr[i] + " ");
      }
    System.out.println ("\nInput the element to be inserted: ");

    x = sc.nextInt ();

    System.
      out.println ("Enter the index at which the element should be placed: ");

    pos = sc.nextInt ();


    for (int i = (n - 1); i >= (pos - 1); i--)
      {

	intArr[i + 1] = intArr[i];

      }
    intArr[pos - 1] = x;

    System.out.println ("\nArray elements after insertion:");

    for (int i = 0; i < n; i++)
      {

	System.out.print (intArr[i] + " ");
      }
    System.out.print (intArr[n]);

  }
    
}