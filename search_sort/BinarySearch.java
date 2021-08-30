package search_sort;

import java.util.Scanner;

public class BinarySearch {

    public int[] int_array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    public Scanner sc = new Scanner(System.in);

    public BinarySearch() {
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

    public int acceptKey() {
        System.out.println("Enter the Search Element: ");
        int se = sc.nextInt();
        return se;
    }

    public void binarySearch(int se) {
        // se: search selement
        int first = 0;
        int last = int_array.length;
        int mid = (first + last) / 2;
        while (true) {
            if (first <= last) {
                if (se < int_array[mid]) {
                    last = mid - 1;
                } else if (se == int_array[mid]) {
                    System.out.println("Search element " + se + " FOUND at " + mid + "th position \n");
                    break;
                } else {
                    first = mid + 1;
                }
                mid = (first + last) / 2;
            } else {
                System.out.println("Search element NOT FOUND...\n");
                break;
            }
        }
    }

    public void closeInputStream() {
        sc.close();
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        // bs.acceptValues();
        int se = bs.acceptKey();
        while (se != 0) {
            bs.binarySearch(se);
            se = bs.acceptKey();
        }
        bs.closeInputStream();
    }
}
