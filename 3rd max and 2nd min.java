/*
Given an integer array and an integer N denoting the array length as input. your task is to return the sum of third largest and second minimum elements of the array.

Input Format

array size and array elements

Constraints

no

Output Format

an int value

Sample Input 0

5
5 3 2 1 4
Sample Output 0

5
Sample Input 1

6
12 45 100 250 300 450
Sample Output 1

295

*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void secondLargest(int a[])
    {
        int b[]=new int[a.length];
         for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b);
       int m=b[a.length-3];
        int k=b[1];
        System.out.println(m+k);
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
        secondLargest(a);
    }
} 
