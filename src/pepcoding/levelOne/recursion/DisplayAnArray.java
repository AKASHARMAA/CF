package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class DisplayAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        displayArray(arr, 0);

    }

    private static void displayArray(int[] arr, int i) {

        if(i == arr.length) return;
        System.out.println(arr[i]);
        displayArray(arr, ++i);
    }
}
