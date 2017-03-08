package DataStructures;

import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int i = 0;
        int pos_sum = 0;
        int sum = 0;
        while (s.hasNext()) {
            arr[i++] = s.nextInt();
        }
        for (int j = 0; j < size; j++) {
            for (int k = j; k < size; k++) {
                sum = sum + arr[k];
                if (sum < 0)
                    pos_sum++;
            }
        }
        sum = 0;
        System.out.println(pos_sum);
        s.close();
    }

}
