import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        scanner.close();
    }
    public static boolean isValidPassword(String password){
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }
}
