/*
Implement a program to print max element in an matrix

Input Format

a 3x3 matrix

Constraints

no

Output Format

max element in matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

9
Sample Input 1

1 0 0
0 2 0
0 0 3
Sample Output 1

3
*/
import java.io.*;
import java.util.*;

public class Solution {

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
        int max=a[0][0];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(max<a[i][j])
                {
                    max=a[i][j];
                }
            
            }
        }
        System.out.println(max);
        
    }
}
