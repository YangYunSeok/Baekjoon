import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine(); // 문자열 입력
        String str = sentence.trim(); // 맨 끝 공백 제거

        String[] word = str.split(" ");

        if (word[0].length() == 0) {
            System.out.println(word.length - 1);
        } else {
            System.out.println(word.length);
        }

        sc.close();
    }
}