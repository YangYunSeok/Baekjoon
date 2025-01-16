import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int card = sc.nextInt(); // 카드개수
        int max_num = sc.nextInt(); // 제일 큰 수
        sc.nextLine();

        int[] each_num = new int[card]; // 각 카드 저장 배열

        for (int i = 0; i < card; i++) {
            each_num[i] = sc.nextInt(); // 각 카드의 수 입력
        }

        int[] output = new int[card * card * card];
        int output_index = 0;

        int sum = 0;
        int max = 0;

        for (int i = 0; i < card; i++) {

            for (int j = 1; j < card; j++) {
                for (int k = 2; k < card; k++) {
                    sum = 0; // sum 초기화

                    if (each_num[i] != each_num[j] && each_num[i] != each_num[k] && each_num[j] != each_num[k]) {
                        sum = each_num[i] + each_num[j] + each_num[k];
                        if (sum <= max_num) {
                            output[output_index] = sum;
                            output_index++;
                        }
                    }

                }
            }
        }

        for (int i = 0; i < output.length; i++) {
            if (max < output[i]) {
                max = output[i];
            }
        }

        System.out.println(max);

        sc.close();
    }
}