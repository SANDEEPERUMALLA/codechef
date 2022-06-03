package codechef.solutions;

import java.util.Scanner;

/**
 * ATM Machine
 * Problem Code:
 * ATM2
 *
 * https://www.codechef.com/submit-v2/ATM2
 */
public class ATMMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T !=0 ) {
            int N = scanner.nextInt();
            int balance = scanner.nextInt();
            while (N != 0) {
                int amountRequired = scanner.nextInt();
                int result = 0;
                if(balance >= amountRequired) {
                    result = 1;
                    balance -= amountRequired;
                }
                System.out.print(result);
                N--;
            }
            T--;
            System.out.println();
        }
    }
}
