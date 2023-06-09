/*
Implement a program to read a string and print number of vowels present in string.

Input Format

string

Constraints

no

Output Format

number of vowels

Sample Input 0

hello
Sample Output 0

2
Sample Input 1

welcome
Sample Output 1

3
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void vowels(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        vowels(s);    
    }
}
