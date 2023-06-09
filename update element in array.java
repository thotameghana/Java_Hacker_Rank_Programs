/*
Implement a program to update an element in the given array

Input Format

size,array elements and element to be updated (old element & new element)

Constraints

no

Output Format

return array after updating

Sample Input 0

5
1 2 3 4 5
2
999
Sample Output 0

1 999 3 4 5
Sample Input 1

5
1 2 3 4 5
1
888
Sample Output 1

888 2 3 4 5
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void update(int a[],int l,int v)
    {
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        b[l]=v;
        for(int i=0;i<b.length;i++)
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
        int l=sc.nextInt();
        int v=sc.nextInt();
        update(a,l,v);
    }
}
