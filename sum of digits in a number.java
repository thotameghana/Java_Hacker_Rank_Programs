/*
Implement a program to find sum of digits present in the given number 'n'.

Input Format

an integer value from the user

Constraints

no

Output Format

sum of digits

Sample Input 0

123
Sample Output 0

6
Sample Input 1

192
Sample Output 1

12
Submissions: 72
Max Score: 1
Difficulty: Medium
Rate This Challenge:

    
More

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r=0;
        while(n>0)
        {
           r=n%10;
           sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
