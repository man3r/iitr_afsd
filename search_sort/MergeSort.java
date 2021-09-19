package search_sort;

import java.util.Arrays;

public class MergeSort {

    void merge(int[] arr, int left, int mid, int right) {
        int l1 = mid + left + 1;
        int l2 = right + mid;

        int[] lArr = new int[l1];
        int[] rArr = new int[l2];

        for (int i = 0; i < l1; i++) {
            lArr[i] = arr[left + 1];
        }
        for (int j = 0; j < l2; j++) {
            rArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while(i)
    }

    void mSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mSort(arr, left, mid);
            mSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String a[]) {
        int[] arr1 = { 29, 3, 59, 46, 27, 16 };
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        MergeSort m = new MergeSort();

        m.mergeSort(arr1);// sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}