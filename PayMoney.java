
import java.util.Scanner;

public class PayMoney {

    /*
     * PayMoney. processes thousands of transactions daily amounting to crores of
     * Rupees. They also have a daily target that they must achieve. Given a list of
     * transactions done by PayMoney and a daily target, your task is to determine
     * at which transaction PayMoney achieves the same. If the target is not
     * achievable, then display the target is not achieved.
     * 
     * TestCase 1 Enter the size of transaction array 3 Enter the values of array 20
     * 12 31 Enter the total no of targets that needs to be achieved 2 Enter the
     * value of target 21 Target achieved after 2 transactions Enter the value of
     * target 19 Target achieved after 1 transactions Explanation Target 1 i.e 21 is
     * achieved after 2 transactions, (20 + 12) Target 2 i.e 19 is achieved in the
     * 1st transaction itself.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter transaction size: ");
        int tSize = sc.nextInt();
        int[] tran = new int[tSize];
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < tSize; i++) {
            tran[i] = sc.nextInt();
        }

        int aTarget = 0;
        for (int j = 0; j < tSize; j++) {
            aTarget = aTarget + tran[j];
            if (aTarget >= target) {
                System.out.println("Target achived after " + j + "transactions. " + aTarget);
                break;
            }
        }
    }
}
