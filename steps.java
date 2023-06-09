/*
You are climbing a stair case. It takes n steps to reach to the top.Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.

Input Format

a number from the user

Constraints

no

Output Format

number of ways

Sample Input 0

1
Sample Output 0

1
Sample Input 1

2
Sample Output 1

2
Sample Input 2

3
Sample Output 2

3
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static int steps(int n)
    {
       if(n<=3)
       {
           return n;
       }
        return steps(n-1)+steps(n-2);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.print(steps(n)+" ");
        
    }
}
