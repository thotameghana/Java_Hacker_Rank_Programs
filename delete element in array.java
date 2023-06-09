/*
mplement a program to delete an element from an array at the position

Input Format

size,array elements and position

Constraints

no

Output Format

return array after deleting from the location

Sample Input 0

5
1 2 3 4 5
2
Sample Output 0

1 2 4 5
Sample Input 1

5
11 22 33 44 55
1
Sample Output 1

11 33 44 55
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void deleteLoc(int a[],int l)
    {
        int b[]=new int[a.length-1];
        for(int i=0;i<b.length;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(b[i]+" ");
        }
        for(int i=l+1;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        deleteLoc(a,l);
}
}
