/*
Two strings a and b are called anagrams, if they contain all the same characters in the same frequencies.

Input Format

two strings a and b

Constraints

no

Output Format

true or false

Sample Input 0

anagram
margana
Sample Output 0

true
Sample Input 1

python
java
Sample Output 1

false
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String m=sc.nextLine();
        char c[]=s.toCharArray();
        char d[]=m.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d))
        {
            System.out.println("true");
            
        }
        else
        {
            System.out.println("false");
            
        }
    }
}
