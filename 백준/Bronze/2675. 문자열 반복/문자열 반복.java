import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int test_case;

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 입력
        test_case = sc.nextInt();

        // 테스트케이스 만큼 케이스 입력
        for (int i = 0; i < test_case; i++) {
            int num = sc.nextInt(); // 반복 횟수 입력
            String array = sc.next(); // 문자열 입력

            // 입력된 문자열을 한 글자씩 분리
            for (int j = 0; j < array.length(); j++) {
                char copy = array.charAt(j);

                // 반복 횟수 만큼 반복
                for (int k = 0; k < num; k++) {
                    System.out.print(copy);
                }
            }

            System.out.println(""); // 케이스 수행후 줄 바꿈
        }

        sc.close();
    }
}