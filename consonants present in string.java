/*
Implement a program to count number of consonants present in string

Input Format

string

Constraints

no

Output Format

number of consonants

Sample Input 0

hello
Sample Output 0

3
Sample Input 1

welcome
Sample Output 1

4
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void consonants(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        consonants(s);
    }
}
