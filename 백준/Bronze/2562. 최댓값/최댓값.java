import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxnum = 0;
        int maxindex = 0;
        int temp = 0;

        int num;
        int array_index = 9;
        int[] array = new int[array_index];

        Scanner sc = new Scanner(System.in);

        // 입력한 수를 배열에 저장
        for (int i = 0; i < array_index; i++) {
            num = sc.nextInt();

            array[i] = num;
        }

        // 입력한 배열에서 최대값 찾기
        for (int i = 0; i < array_index; i++) {
            // 배열의 값이 임시값보다 크면 최대값에 배열값을 저장
            if (array[i] > temp) {
                temp = array[i];
                maxnum = temp;
            }
            // 그렇지 않으면 패스
            else {
                continue;
            }

            // 최대값의 인덱스 값을 저장
            if (array[i] == maxnum) {
                maxindex = i;
            }
        }

        // 출력
        System.out.println(maxnum);
        System.out.println(maxindex + 1);

        sc.close();
    }
}