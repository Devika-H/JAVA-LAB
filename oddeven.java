
//3.check given no is odd or even

import java.util.*;
public class oddeven
{
	public static void main (String [] args)
	{
		int x;
		System.out.println("Enter the number:");
		Scanner num = new Scanner(System.in);
		x = num.nextInt();
		if ( x % 2 == 0 )
        System.out.println("Number is even");
        else
        System.out.println("Number is odd");
	}
}



/* 
Input 
9

Output

Enter the number:
Number is odd

*/