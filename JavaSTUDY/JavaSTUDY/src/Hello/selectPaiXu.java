package Hello;

import java.util.*;

//选择排序：每一趟选出未排序中数字最大（小）的数字
public class selectPaiXu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            int min = a[i];
            for (int j = i + 1; j < 5; j++) {
                if (a[j] < min) {
                    min = a[j];
                    a[j] = a[i];
                    a[i] = min;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
