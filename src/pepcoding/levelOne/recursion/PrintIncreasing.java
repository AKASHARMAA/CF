package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if(n == 0) {
            return;
        }

        printIncreasing(--n);
        System.out.println(n);
    }
}
