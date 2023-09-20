package lvlone;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String words[] = new String[n];

        for(int i = 0 ; i < words.length ; i ++) {
            words[i] = scanner.nextLine();
        }
        scanner.close();

        String answer = "";
        for(String word : words) {
            if(word.length() > 10) {
                answer = "";
                answer += word.charAt(0);
                answer += word.length() - 2;
                answer += word.charAt(word.length() - 1);
                System.out.println(answer);
            } else {
                System.out.println(word);
            }
        }
    }
}
