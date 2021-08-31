package search_sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public int[] int_array = { 60, 30, 20, 70, 100, 10, 40, 50, 80, 90 };
    public Scanner sc = new Scanner(System.in);

    public SelectionSort() {
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

    public void selectionSort() {
        System.out.println("Before sort: " + Arrays.toString(int_array));
        int len = int_array.length;
        for (int i = 0; i < len - 1; i++) {
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (int_array[j] < int_array[index]) {
                    index = j;
                }
                int snum = int_array[index];
                int_array[index] = int_array[i];
                int_array[i] = snum;
            }
        }
        System.out.println("After sort: " + Arrays.toString(int_array));
    }

    public void closeInputStream() {
        sc.close();
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        // ss.acceptValues();
        ss.selectionSort();
        ss.closeInputStream();
    }
}
