/*
Implement a program to reverse each element in the matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

result matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

1 2 3
4 5 6
7 8 9
Sample Input 1

11 12 13
14 15 16
17 18 19
Sample Output 1

11 21 31
41 51 61
71 81 91
Submissions: 27
Max Score: 1
Difficulty: Medium
Rate This Challenge:

    
More
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void reverse(int a[][])
    {
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int n=a[i][j];
                int re=0,r=0;
                while(n>0)
                {
                    r=n%10;
                    re=re*10+r;
                    n=n/10;
                }
                System.out.print(re+" ");
            }
             System.out.println();
         }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        reverse(a);
    }
}
