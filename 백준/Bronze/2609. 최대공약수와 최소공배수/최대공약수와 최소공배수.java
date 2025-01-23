import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();

        int[] common_d = new int[10000];
        int common_index = 0;
        int max_d = 0;

        for (int i = 1; i < 10000; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                common_d[common_index] = i; // num1 약수 저장
            }

            if (common_d[common_index] > max_d) { // 최대공약수 구하기
                max_d = common_d[common_index];
            }

            common_index++; // 인덱스 증가
        }

        System.out.println(max_d);
        System.out.println(max_d * (num1 / max_d) * (num2 / max_d));

        sc.close();
    }
}