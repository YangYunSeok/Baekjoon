import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 참가자수 입력
        int people = sc.nextInt();
        int count = 0;

        int[] T = new int[6];

        // 티셔츠 사이즈 요청
        for (int i = 0; i < T.length; i++) {
            T[i] = sc.nextInt();
        }

        int[] set = new int[2];

        // 세트 묶음수 입력
        for (int i = 0; i < set.length; i++) {
            set[i] = sc.nextInt();
        }

        // 티셔츠 출력 계산
        for (int j = 0; j < T.length; j++) {
            if (T[j] == 0) {
                count += 0;
            } else if (T[j] <= set[0]) { // 요청수가 세트수보다 작거나 같으면 & 0이 아닐때
                count += 1; // 1세트
            } else if (T[j] % set[0] == 0) {
                count += (T[j] / set[0]);
            } else {
                count += (T[j] / set[0]) + 1;
            }
        }

        // 펜 출력 계산
        int pen_set = people / set[1];
        int pen = people - (set[1] * pen_set);

        System.out.println(count);
        System.out.println(pen_set + " " + pen);

        sc.close();
    }
}