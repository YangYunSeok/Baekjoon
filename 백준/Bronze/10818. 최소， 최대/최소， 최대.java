import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        int max;
        int min;

        ArrayList<Integer> array = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // 정수 갯수 입력
        count = sc.nextInt();

        // 해당 배열에 입력한 개수만큼 정수 저장
        for (int i = 0; i < count; i++) {
            array.add(sc.nextInt());
        }

        // 최대 최소값 구하기
        max = Collections.max(array);
        min = Collections.min(array);

        System.out.println(min + " " + max);

        sc.close();
    }
}