package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class TOH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.close();
        
        
        toh(n, "A", "B", "C");
    }

    private static void toh(int n, String A, String B, String C) {
        if(n == 1) {
            System.out.println(n + " -> [" + A + ", " + B + "]");
            return;
        }

        toh(n-1, A, C, B);
        System.out.println(n + " -> [" + A + ", " + B + "]");
        toh(n-1, C, B, A);
    }
}
