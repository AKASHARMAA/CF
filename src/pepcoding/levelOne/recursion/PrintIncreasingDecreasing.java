package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();


        printIncreasingDecreasing(n);
    }

    private static void printIncreasingDecreasing(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        printIncreasingDecreasing(--n);
        System.out.println(n);
    }
}
