/*
Implement a program to find sum of n natural numbers.

Input Format

an integer value

Constraints

no

Output Format

sum of natural numbers

Sample Input 0

5
Sample Output 0

15
Sample Input 1

4
Sample Output 1

10
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static int sumOf(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sumOf(n-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sumOf(n);
        System.out.print(r);
    }
}
