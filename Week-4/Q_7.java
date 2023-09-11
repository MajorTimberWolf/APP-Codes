public class Q_7 {
    public static void main(String[] args) {
        System.out.println("Numbers with all even digits between 100 and 400");
        for (int i = 100; i <= 400; i++) {
            if (isAllEven(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean isAllEven(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}