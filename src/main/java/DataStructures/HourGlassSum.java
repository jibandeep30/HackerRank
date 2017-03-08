package DataStructures;

import java.util.*;

public class HourGlassSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                arr[i][j] = s.nextInt();
        int max_sum = -500;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i + 0][j + 0] + arr[i + 0][j + 1] + arr[i + 0][j + 2] + arr[i + 1][j + 1]
                        + arr[i + 2][j + 0] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > max_sum)
                    max_sum = sum;
            }
        }
        System.out.println("The max sum is : " + max_sum);
    }
}
