/*
You are given a list of integers of size N,
write an algorithm to sort the first K elements of the list in ascending order and the remaining elements in descending order.

Input Format

an arry size and elements

Constraints

no

Output Format

updated array

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 2 5 4 3
Sample Input 1

8
1 8 2 7 3 6 4 5
Sample Output 1

1 2 3 4 8 7 6 5*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void halfSort(int a[])
    {
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<b.length/2;i++)
        {
            System.out.print(b[i]+" ");
        }
        for(int i=b.length-1;i>=(a.length/2);i--)
        {
            System.out.print(b[i]+" ");
        }
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
        halfSort(a);
    }
}
