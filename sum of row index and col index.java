/*
Implement a program to find sum of row index and col index is even in the given matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

sum as an int

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

25
Sample Input 1

1 0 0
0 1 0
0 0 1
Sample Output 1

3
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void sumOfDiag(int a[][])
    {
        int sum=0;
         for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
               if((i+j)%2==0)
               {
                   sum=sum+a[i][j];
               }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=3;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sumOfDiag(a);
    }
}
