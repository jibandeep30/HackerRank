package DataStructures;

import java.util.*;

class MathException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    public int power(int n, int p) throws Exception {

        int value = (int) Math.pow(n, p);
        if (value > 0)
            return value;
        else
            throw new Exception("n and p should be non-negative");
    }
}