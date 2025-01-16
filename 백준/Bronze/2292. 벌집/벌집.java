import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 1;

        if (num == 1) {
            System.out.println(1);
        }

        for (int i = 1; i < num; i++) {
            sum += i * 6;
            // System.out.println("sum : " + sum);
            if (num <= sum) {
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}