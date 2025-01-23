import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int list = sc.nextInt(); // 과목 수 입력
        int[] score = new int[list];

        int max = 0;
        double sum = 0;
        double dvalue = 0.0;

        // 과목 수 만큼 점수 입력
        for (int i = 0; i < list; i++) {
            score[i] = sc.nextInt();

            // 최고점수 구하고 해당 값의 인덱스 저장
            if (max < score[i]) {
                max = score[i];
            }
        }

        // 계산
        for (int i = 0; i < list; i++) {
            dvalue = (double) score[i] / max * 100;

            sum += dvalue; // 점수 조작 수 합

            dvalue = 0; // 계산 후 초기화

        }

        System.out.println(sum / (double) list);

        sc.close();
    }
}