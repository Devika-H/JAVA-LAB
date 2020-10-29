
//10.amstrong or not

import java.util.*;
public class Armstrong 
{
    public static void main ( String [] args) 
	{
        int n, x, temp, sum=0;
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = n;
        for( ; x!=0; x /= 10)
        {
            temp = x%10;
            sum = sum + temp*temp*temp;
        }
        if(sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}


/* 
Input 
153

Output

Enter the Number
153 is an Armstrong number

*/