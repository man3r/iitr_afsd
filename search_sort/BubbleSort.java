package search_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public int[] int_array = { 60, 30, 20, 70, 100, 10, 40, 50, 80, 90 };
    public Scanner sc = new Scanner(System.in);

    public BubbleSort() {
    }

    public void acceptValues() {
        System.out.println("Enter the lenghth of array: ");
        int len = sc.nextInt();
        int_array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter search elements: ");
            int_array[i] = sc.nextInt();
        }

    }

    public void bubbleSort() {
        System.out.println("Before sort: " + Arrays.toString(int_array));
        int len = int_array.length;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (int_array[j - 1] > int_array[j]) {
                    temp = int_array[j - 1];
                    int_array[j - 1] = int_array[j];
                    int_array[j] = temp;
                }
            }
        }
        System.out.println("After sort: " + Arrays.toString(int_array));
    }

    public void closeInputStream() {
        sc.close();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        // bs.acceptValues();
        bs.bubbleSort();
        bs.closeInputStream();
    }
}
