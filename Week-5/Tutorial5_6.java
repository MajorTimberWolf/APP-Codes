import java.util.HashSet;

public class Tutorial5_6 {
    public static void main(String[] args) {
        String mobileNumber = "0123456789";
        HashSet<Character> missingDigits = findMissingDigits(mobileNumber);

        if (missingDigits.isEmpty()) {
            System.out.println("No missing digits");
        } else {
            System.out.println("Missing digits: " + missingDigits);
        }
    }

    public static HashSet<Character> findMissingDigits(String mobileNumber) {
        HashSet<Character> missingDigits = new HashSet<Character>();
        for (char digit = '0'; digit <= '9'; digit++) {
            missingDigits.add(digit);
        }

        HashSet<Character> presentDigits = new HashSet<>();
        for (char digit : mobileNumber.toCharArray()) {
            presentDigits.add(digit);
        }

        missingDigits.removeAll(presentDigits);
        return missingDigits;
    }
}
