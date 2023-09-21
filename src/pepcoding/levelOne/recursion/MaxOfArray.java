package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(maxOfArray(arr, 0));

    }

    private static int maxOfArray(int[] arr, int i) {
        if(i == arr.length) return Integer.MIN_VALUE;
        int max = maxOfArray(arr, i + 1);
        if(max < arr[i]) max = arr[i];
        return max;
    }

}
