package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int result = factorial(n);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if(n == 0) return 1;

        int value =  n * factorial(n-1);
        return value;
    }

}
