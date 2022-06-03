package codechef.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
    Weapon Value
    Problem Code:
    SC31

    https://www.codechef.com/submit-v2/SC31
 */
public class WeaponValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            // test case start
            int N = scanner.nextInt();
            List<String> weaponStrings = new ArrayList<>();
            while (N != 0) {
                weaponStrings.add(scanner.next());
                N--;
            }
            processWeaponStrings(weaponStrings);
            // test case end
            T--;
        }
    }

    private static void processWeaponStrings(List<String> weaponStrings) {
        if (weaponStrings.size() == 0) {
            System.out.println();
            return;
        }

        if (weaponStrings.size() == 1) {
            System.out.println(getWeaponCount(weaponStrings.get(0)));
            return;
        }

        int n = weaponStrings.size();
        String result = battle(weaponStrings.get(0), weaponStrings.get(1));
        for (int i = 2; i < n; i++) {
            result = battle(result, weaponStrings.get(i));
        }
        System.out.println(getWeaponCount(result));
    }

    private static long getWeaponCount(String result) {
        return result.chars().filter(ch -> ch == '1').count();
    }

    private static String battle(String s1, String s2) {
        int n = s1.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(xor(s1.charAt(i), s2.charAt(i)));
        }
        return result.toString();
    }

    private static char xor(char ch1, char ch2) {
        if (ch1 == '0' && ch2 == '0') {
            return '0';
        } else if (ch1 == '1' && ch2 == '0') {
            return '1';
        } else if (ch1 == '0' && ch2 == '1') {
            return '1';
        } else {
            return '0';
        }
    }
}
