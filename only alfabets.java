import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        int count = 0;
        for (int i = 0; i < m.length() - 2; i++) {
            if (m.substring(i, i + 3).equals("^_^")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
