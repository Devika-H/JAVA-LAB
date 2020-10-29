
//6.find the factor of a given number

import java.util.*;
public class Factor 
{
  public static void main( String [] args) 
  {
    int n;
	System.out.println("Enter the number");
	Scanner num = new Scanner(System.in);
    n = num.nextInt();
    System.out.print("Factors of " +n+ " are:  ");
    for (int i=1; i<= n; ++i) 
	{
      if (n%i == 0)
	  {
        System.out.print(i + ", ");
      }
    }
  }
}


/* 
Input 
24

Output

Enter the number
Factors of 24 are:  1, 2, 3, 4, 6, 8, 12, 24,

*/
