/*
Implement a program to read a matrix and check whether the given matrix is symmertric matrix or not

Input Format

a 3x3 matrix

Constraints

no

Output Format

Yes or No

Sample Input 0

1 2 3
2 4 5
3 5 8
Sample Output 0

Yes
Sample Input 1

1 0 0
0 1 0
0 0 1
Sample Output 1

Yes
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean symetric(int a[][])
    {
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    return false;
                }
            }
        }
        return true;
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
       if(symetric(a))
       {
            System.out.println("Yes");
       }
        else
        {
            System.out.println("No");
        }
    }
}
