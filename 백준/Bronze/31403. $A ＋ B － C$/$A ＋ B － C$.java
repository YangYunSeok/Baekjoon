import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array_int = new int[3];
        String[] array_String = new String[array_int.length];

        Scanner sc = new Scanner(System.in);

        // 수 입력
        for (int i = 0; i < 3; i++) {
            array_int[i] = sc.nextInt();
        }

        // 문자열 변환
        for (int i = 0; i < 3; i++) {
            array_String[i] = Integer.toString(array_int[i]);
        }

        // 출력
        System.out.println(array_int[0] + array_int[1] - array_int[2]);
        System.out.println(Integer.parseInt(array_String[0] + array_String[1]) - Integer.parseInt(array_String[2]));

        sc.close();
    }
}