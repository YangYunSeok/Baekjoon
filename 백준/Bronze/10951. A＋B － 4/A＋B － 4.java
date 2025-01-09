import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;

        int sum;

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            sc.nextLine();

            if (num1 < 0 || num2 > 10) {
                break;
            }

            sum = num1 + num2;

            System.out.println(sum);
        }
        sc.close();

    }
}