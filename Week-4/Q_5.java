import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int letterCount = 0;
        int digitCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
