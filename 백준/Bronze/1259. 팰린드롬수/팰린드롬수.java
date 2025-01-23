import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = new char[5];
        char[] copy = new char[5];

        String num_String;

        int count = 0;
        int index = 0;

        while (true) { // 무한반복
            int num = sc.nextInt();

            num_String = Integer.toString(num);

            // 0을 입력하면 종료
            if (num == 0) {
                break;
            }

            // 최대 99999의 수를 배열에 저장
            for (int i = 0; i < num_String.length(); i++) {
                input[i] = num_String.charAt(i);

            }

            // 반대로 저장
            for (int i = 0; i < num_String.length(); i++) {
                copy[i] = input[num_String.length() - 1 - index];
                index++;

            }

            // 저장된 배열을 뒤에서 부터 비교
            for (int i = 0; i < num_String.length(); i++) {
                // 같은지 확인
                if (input[i] == copy[i]) {

                    count++;
                }
            }

            // 모두 동일하면
            if (count == num_String.length()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            // 초기화
            count = 0;
            index = 0;
        }

        sc.close();
    }
}