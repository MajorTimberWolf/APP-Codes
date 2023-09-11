import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2; // sum of two integers
        if (sum >= 105 && sum <= 200) {
            sum = 200;
            System.out.println("Result = " + sum);
        }
        scanner.close();
    }
}
