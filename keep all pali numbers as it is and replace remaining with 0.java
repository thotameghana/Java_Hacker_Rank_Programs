/*
Implement a program to keep all pali numbers as it is and replace remaining with 0.

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

111 122 133
141 151 168
888 567 999
Sample Output 1

111 0 0
141 151 0
888 0 999
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void pali(int a[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int n=a[i][j];
                int r=0,re=0;
                while(n>0)
                {
                    r=n%10;
                    re=re*10+r;
                    n=n/10;
                }
                if(a[i][j]==re)
                {
                    System.out.print(re+" ");
                }
                else
                {
                    System.out.print("0 ");
                }
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
        pali(a);
    }
}
