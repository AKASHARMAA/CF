package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value for x : " );
        int x = scanner.nextInt();

        System.out.println("Please enter a value for n : ");
        int n = scanner.nextInt();

        scanner.close();


        int result = linearPower(x, n);
        System.out.println("Result is : " + result);
    }

    private static int linearPower(int x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;

        int value1 = linearPower(x, n/2);
        int value2 = linearPower(x, n%2);
        return value1 * value1 * value2;
    }
}
