package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class PrintDecreasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();


        printDecreasing(n);
    }

    private static void printDecreasing(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }
}
