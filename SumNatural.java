
//5.find the sum of first “n” natural numbers

import java.util.*;
public class SumNatural
{
	public static void main (String [] args)
	{
		 int i=1,n;
		 int sum=0;
		 System.out.println(" Input n ");
		 Scanner num = new Scanner(System.in);
         n = num.nextInt();
		 while (i<=n)
		 {
           sum +=i;
           i++;
         }
         System.out.println("Sum of first "+n+" natural numbers is: "+sum);
    }
}


/* 
Input 
10

Output

Input n 
Sum of first 10 natural numbers is: 55 

*/