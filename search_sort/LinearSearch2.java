package search_sort;

import java.util.Scanner;

public class LinearSearch2 {

    public int[] int_array = {};
    public Scanner sc = new Scanner(System.in);

    public LinearSearch2() {
    }

    public void insertValues() {
        System.out.println("Enter the lenghth of array: ");
        int len = sc.nextInt();
        int_array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter search elements: ");
            int_array[i] = sc.nextInt();
        }
    }

    public int acceptSearchElement() {
        System.out.println("Enter the Search Element: ");
        int se = sc.nextInt();
        return se;
    }

    public void linearSearch(int se) {
        // se: search selement
        for (int i = 0; i < int_array.length; i++) {
            if (int_array[i] == se) {
                System.out.println("Search element " + se + " FOUND at " + i + "th position \n");
                return;
            }
        }
        System.out.println("Search element NOT FOUND...\n");
    }

    public void closeInputStream() {
        sc.close();
    }

    public static void main(String[] args) {
        LinearSearch2 ls = new LinearSearch2();
        ls.insertValues();
        int se = ls.acceptSearchElement();
        while (se != 0) {
            ls.linearSearch(se);
            se = ls.acceptSearchElement();
        }
        ls.closeInputStream();
    }
}
