package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class DisplayAnArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        displayArrayRev(arr, arr.length - 1);

    }

    private static void displayArrayRev(int[] arr, int i) {

        if(i < 0) return;
        System.out.println(arr[i]);
        displayArrayRev(arr, --i);
    }
}
