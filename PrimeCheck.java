
//4.check given no is prime or not

import java.util.*;
public class primecheck
{
	public static void main (String [] args)
	{
		 int i,n;
		 int x=0;
		 System.out.println(" Enter the number ");
		 Scanner num = new Scanner(System.in);
		 n = num.nextInt();
		 for ( i=2; i<=(n/2); i++ )
		 {
			 if ( n%i==0 )
				 x=1;
		 }
		 if ( x==1 )
			 System.out.println(" Number is not prime ");
		 else
			 System.out.println(" Number is prime ");
		 
	}
}


/* 
Input 
97

Output

Enter the number 
 Number is prime 

*/