
//7.print Fibonacci series

import java.util.*;
public class Fibonacci 
{
    public static void main( String [] args) 
	{
        int i=1, x1=0, x2=1, n, sum;
		System.out.println("Input n");
		Scanner num = new Scanner(System.in);
        n = num.nextInt();
        System.out.print("First " +n+ " Fibonacci series is :  ");
        while (i <= n)
        {
            System.out.print(x1 + ", ");
            sum = x1 + x2;
            x1 = x2;
            x2 = sum;
            i++;
        }
    }
}


/* 
Input 
13

Output

Input n
First 13 Fibonacci series is :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,

*/