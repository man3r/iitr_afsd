package search_sort;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > key)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String a[]) {
        int[] arr1 = { 29, 3, 59, 46, 27, 16 };
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr1);// sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}