package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class FirstIndexOfOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("enter the number to find  : ");
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(firstIndex(arr, 0, x));

    }

    private static int firstIndex(int[] arr, int i, int x) {
        if(i == arr.length) return -1;
        if(arr[i] == x) return i;
        return firstIndex(arr, i + 1, x);
    }
}
