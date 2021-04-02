{
  public static void main (String[]args) throws Exception
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("The number of elements in the array: ");
    int n = sc.nextInt (), x;
    int intArr[] = new int[n];
      System.out.println ("Enter the array elements : ");
    for (int i = 0; i < n; i++)
      {
	intArr[i] = sc.nextInt ();
      }
    System.out.println ("\nThe Array elements are as follows: ");
    for (int i = 0; i < n; i++)
      {
	System.out.print (intArr[i] + " ");
      }
    int search_el;
    System.out.println("\nInput the element to replace and thus, 'update' the array - ");
    search_el = sc.nextInt ();
    System.out.println ("\nInput the new element: ");
    x = sc.nextInt ();
    for (int i = 0; i < n; i++)
      {
	if (intArr[i] == search_el)
	  {
	    intArr[i] = x;
	    break;
	  }
      }
    System.out.println ("Array elements after updating: ");
    for (int i = 0; i < n; i++)
      {
	System.out.print(intArr[i] + " ");
      }
      
  }
    
}