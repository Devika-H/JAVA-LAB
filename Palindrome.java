
//9.check given no is palindrome or not

import java.util.*;
public class Palindrome 
{
    public static void main (String [] args) 
	{
        int n, x, y=0, r;
        System.out.println("Enter the number");
	    Scanner num = new Scanner(System.in);
        n = num.nextInt();
        x=n;
        while( n!=0 )
        {
            r = n%10;
            y = y*10+r;
            n /= 10;
        }
        if (x == y)
            System.out.println(x + " is a palindrome number.");
        else
            System.out.println(x + " is not a palindrome number.");
    }
}

/* 
Input 
121

Output

Enter the number
121 is a palindrome number.

*/