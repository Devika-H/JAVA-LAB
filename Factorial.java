
//8.factorial of first n numbers

import java.util.*;
public class Factorial 
{
    public static void main( String [] args) 
	{
        int n,i;
        long factorial=1;
		System.out.println("Enter the number");
	    Scanner num = new Scanner(System.in);
        n = num.nextInt();
		if(num==0)
        {
            System.out.println("Error : Invalid entry");
        }
        for (i=1; i<=n; i++)
        {
			for(int j=1;j<=i;j++)
            {
              factorial *= j;
			}
            System.out.println("Factorial of "+i+" = "  +factorial);
			factorial = 1;
		}
    }
}


/* 
Input 
10

Output

Enter the number
Factorial of 1 = 1
Factorial of 2 = 2
Factorial of 3 = 6
Factorial of 4 = 24
Factorial of 5 = 120
Factorial of 6 = 720
Factorial of 7 = 5040
Factorial of 8 = 40320
Factorial of 9 = 362880
Factorial of 10 = 3628800

*/

