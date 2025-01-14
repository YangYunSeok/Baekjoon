import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int[] asc = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] des = { 8, 7, 6, 5, 4, 3, 2, 1 };

        int[] input = new int[8];

        // ArrayList input = new ArrayList<>();

        int asc_num = 0;
        int des_num = 0;

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] == asc[i]) {
                asc_num++;
            } else if (input[i] == des[i]) {
                des_num++;
            }

        }

        if (asc_num == 8) {
            System.out.println("ascending");
        } else if (des_num == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        sc.close();
    }
}