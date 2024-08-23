package Hello;

import java.util.*;

public class BluePaiXu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
//实现冒泡排序：两两比较，交换位置，布鲁布鲁地一个个出来答案
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
