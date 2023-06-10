/*
Implement a program to convert lower case into upper case and upper case into lower case (swap case)

Input Format

string

Constraints

no

Output Format

toggle case

Sample Input 0

abc
Sample Output 0

ABC
Sample Input 1

Prakash
Sample Output 1

pRAKASH
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void upperLower(String s)
    {
        String m="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                m+=Character.toLowerCase(c);
            }
            if(Character.isLowerCase(c))
            {
                m+=Character.toUpperCase(c);
            }
        }
        System.out.println(m);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        upperLower(s);
    }
}
