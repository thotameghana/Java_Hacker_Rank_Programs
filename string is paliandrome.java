/*
Implement a program to check whether the given string is paliandrome or not, if yes return true else return false

Input Format

string from the user

Constraints

no

Output Format

true or false

Sample Input 0

abab
Sample Output 0

false
Sample Input 1

abba
Sample Output 1

true
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String b=new String(sb);
        if(s.equals(b))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}
