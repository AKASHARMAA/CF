package lvlone;

import java.util.Scanner;

public class GoldRush {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for(int i = 0 ; i < testCases; i ++) {
            int n = scanner.nextInt();
            int want = scanner.nextInt();
            exists = false;
            ifExist(n,want);
            if(exists) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();

    }

    private static boolean exists = false;
    private static void ifExist(int n, int want) {
        if (n == want) {
            exists = true;
            return;
        }

        if (n < want || n % 3 != 0) {
            return;
        }

        ifExist((n/3) * 2, want);
        ifExist((n/3), want);
    }
}
