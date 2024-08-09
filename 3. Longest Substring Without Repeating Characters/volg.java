package ippoForce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class volg {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String a = sn.next();

        System.out.println(longest(a));
    }

    public static int longest(String s) {

        int right = 0, left = 0, max = 0;

        Set<Character> set = new HashSet();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }

        }
        return max;

    }
}