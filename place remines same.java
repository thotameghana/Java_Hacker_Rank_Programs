/*
You are given an array of integers, a of size n, Your task is to find the number of elements whose positions will remain unchanged after sorted in ascending order.

Input Format

array size and elements

Constraints

no

Output Format

unchanged count

Sample Input 0

5
1 2 5 3 4
Sample Output 0

2
Sample Input 1

10
1 10 2 9 3 8 4 7 5 6
Sample Output 1

1
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void repeat(int a[])
    {
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b);
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        repeat(a);
    }
}
