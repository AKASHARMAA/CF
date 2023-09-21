package pepcoding.levelOne.recursion;

import java.util.Scanner;

public class LastIndexOfOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int arr[] = new int[n];

        for(int i = 0 ; i < n; i ++ ){
            arr[i] = scanner.nextInt();
        }

        System.out.println("enter the number to find : ");

        int x = scanner.nextInt();
        scanner.close();


        int index = lastIndexOfOccurance(arr, arr.length - 1, x);
        System.out.println(index);
    }

    private static int lastIndexOfOccurance(int[] arr, int i, int x) {
        if(i < 0) return -1;
        if(arr[i] == x) return i;
        return lastIndexOfOccurance(arr, i - 1, x);
    }
}
