package search_sort;

import java.util.Scanner;

public class LinearSearch {
    private static boolean linearSearch;

    public boolean linearSearch(int se) {
        // se: search selement

        int[] int_array = { 5, 8, 10, 15, 12, 0, 19, 6, 7 };

        for (int i = 0; i < int_array.length; i++) {
            if (int_array[i] == se) {
                System.out.println("Search element " + se + " FOUND at " + i + "th position");
                return true;
            }
        }
        System.out.println("Search element NOT FOUND...");
        return false;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        Scanner s = new Scanner(System.in);
        int se = 1;
        while (se != 0) {
            System.out.println("Enter search element (0 to exit): ");
            se = s.nextInt();
            boolean b = ls.linearSearch(se);
        }
        s.close();
    }
}
