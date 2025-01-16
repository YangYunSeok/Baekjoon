import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int n = sc.nextInt(); // 개수
        boolean check = false;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            // 1은 소수가 아님
            if (num == 1) {
                count += 0;
            } else if (num == 3 || num == 2) {
                count += 1;
            }

            // 2부터 제곱근 이하로 나누었을때 나누어 떨어지면 소수 아님
            for (int j = 2; j <= Math.sqrt(num); j++) {
                check = false;

                if (num % j == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }

            if (check) {
                if (num == 3 || num == 2) {
                    count += 0;
                } else {
                    count += 1;
                }
            }

        }

        System.out.println(count);

        sc.close();
    }
}