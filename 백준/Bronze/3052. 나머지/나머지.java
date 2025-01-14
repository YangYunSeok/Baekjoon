import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;
        int count = 0;
        boolean check = false;

        int[] change = new int[10]; // 10개의 값을 저장

        for (int i = 0; i < 10; i++) {
            change[i] = sc.nextInt() % 42; // 42로 나눈 나머지를 저장
        }

        for (int i = 0; i < change.length; i++) {
            temp = change[i];

            for (int j = i + 1; j < change.length; j++) {
                if (temp != change[j]) {
                    check = false;
                } else if (temp == change[j]) {
                    check = true;
                    break;
                }
            }

            if (check == false) {
                count++;
            }

        }

        if (count == 0) {
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}