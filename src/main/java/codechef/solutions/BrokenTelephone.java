package codechef.solutions;

import java.util.*;
/*
    Broken Telephone
    Problem Code:
    BROKPHON
    https://www.codechef.com/submit-v2/BROKPHON
 */
public class BrokenTelephone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            // test case start
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            Set<Integer> uniqueSet = new HashSet<>();
            for (int i = 1; i < N; i++) {
                if (arr[i - 1] != arr[i]) {
                    uniqueSet.add(i - 1);
                    uniqueSet.add(i);
                }
            }
            System.out.println(uniqueSet.size());
            // test end
            T--;
        }
    }
}
