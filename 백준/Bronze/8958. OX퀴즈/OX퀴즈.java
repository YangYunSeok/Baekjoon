import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt(); // 테스트케이스 입력

        String[][] ox = new String[test_case][1];
        String ox_I;

        int[][] score = new int[test_case][1];

        int sum = 0;
        int grade = 0;

        for (int i = 0; i < test_case; i++) { // 테스트 케이스 만큼
            ox_I = sc.next(); // ox 입력
            char[] array = new char[ox_I.length()];

            for (int j = 0; j < array.length; j++) {
                array[j] = ox_I.charAt(j);

                if (array[j] == 'O') {
                    grade++;
                    sum = sum + grade;
                } else {
                    grade = 0;
                }
            }

            System.out.println(sum);
            sum = 0; // 케이스 하나 결과를 출력해주고 나면 초기화
            grade = 0;
        }

        sc.close();
    }
}