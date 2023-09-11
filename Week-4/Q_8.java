import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month name: ");
        String month = scanner.nextLine().toLowerCase();

        int days = getDaysInMonth(month);

        if (days == -1) {
            System.out.println("Invalid month name");
        } else {
            System.out.println("Number of days in " + month + " is " + days);
        }
        scanner.close();
    }

    public static int getDaysInMonth(String month) {
        String[] monthsWith31Days = { "january", "march", "may", "july", "august", "october", "december" };
        String[] monthsWith30Days = { "april", "june", "september", "november" };

        if (month.equals("february")) {
            return 28;
        } else if (contains(monthsWith31Days, month)) {
            return 31;
        } else if (contains(monthsWith30Days, month)) {
            return 30;
        } else {
            return -1;
        }
    }

    public static boolean contains(String[] arr, String str) {
        for (String s : arr) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
