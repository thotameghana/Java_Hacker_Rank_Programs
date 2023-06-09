/*
Implement a program to check whether the given number is prime or not.

Input Format

an integer value

Constraints

no

Output Format

true or false

Sample Input 0

3
Sample Output 0

true
Sample Input 1

6
Sample Output 1

false
Sample Input 2

7
Sample Output 2

true
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int n)
    {
        int s=0;
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                s++;
            }
        }
        if(s==0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean r=isPrime(n);
        if(r)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
