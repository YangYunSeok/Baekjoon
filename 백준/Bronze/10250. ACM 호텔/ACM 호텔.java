import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] input = new int[3];
        int[] output = new int[num];

        int floor = 0;
        int room = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < input.length; j++) {
                input[j] = sc.nextInt(); // 층, 룸, 도착 순서 입력
            }

            floor = (input[2] % input[0]) * 100; // 층수
            room = input[2] / input[0]; // 층수

            if (floor == 0) {
                output[i] = (input[0] * 100) + room;
            } else {
                output[i] = floor + room + 1;
            }

        }

        for (int i = 0; i < num; i++) {
            System.out.println(output[i]);
        }

        sc.close();
    }
}