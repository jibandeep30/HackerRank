package ExceptionHandling;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String i = s.next();
        String j = s.next();
        try {
            int l = Integer.parseInt(i);
            int m = Integer.parseInt(j);
            System.out.println(l / m);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
