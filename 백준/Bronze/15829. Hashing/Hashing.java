import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        long M = 1234567891;

        char[] eng_array = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        int length = sc.nextInt();
        String senten = sc.next();

        char[] spilt_array = new char[length]; // Large가 50이여서 최대 인덱스를 50으로 설정

        long powValue = 0;

        powValue = (long) Math.pow(31, 0);

        for (int i = 0; i < length; i++) {
            spilt_array[i] = senten.charAt(i); // 입력된 문자열을 빈배열에 저장

            for (int j = 0; j < eng_array.length; j++) {
                // 입력된 알파벳 인덱스 찾기
                if (eng_array[j] == spilt_array[i]) {

                    sum += ((j + 1) * powValue) % M; // 입력순서 * 31 제곱(입력인덱스) % M

                    powValue = (powValue * 31) % M;

                    break;
                }
            }
        }

        System.out.println(sum % M);

        sc.close();
    }
}