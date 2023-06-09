/*
Implement a program to check whether an array is paliandrome or not.

Input Format

Array size N and Array Elements

Constraints

no

Output Format

true or false

Sample Input 0

5
1 2 3 2 1
Sample Output 0

true
Sample Input 1

4
10 11 12 13
Sample Output 1

false
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        boolean isPalindrome=true;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            b[n-1-i]=a[i];
        }
       for(int i=0;i<n;i++)
       {
            if(a[i]!=b[i])
                isPalindrome=false;
                break;
       }
        if(isPalindrome)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }  
    }
}
