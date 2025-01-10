import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳 배열
        char[] eng = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        // 숫자 기입 배열
        int[] find = new int[26];

        // 배열에 -1 채우기
        for (int j = 0; j < 26; j++) {
            find[j] = -1;
        }

        // 단어입력
        String word = sc.next();

        // String으로 입력한 단어를 비교
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);

            // 숫자를 인덱스로 바꾸기
            for (int j = 0; j < 26; j++) {

                // 최초 값만 바꾸기 위한 조건
                if (find[j] == -1) {

                    // 알바벳과 입력 값이 같을때
                    if (eng[j] == temp) {
                        find[j] = i; // 해당 인덱스를 저장
                    }
                }
            }

        }

        // 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(find[i] + " ");
        }

        sc.close();
    }
}