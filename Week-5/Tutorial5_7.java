public class Tutorial5_7 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;

        if (checkCondition(num1, num2)) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
    }

    public static boolean checkCondition(int a, int b) {
        return a == b || Math.abs(a - b) == 5 || a + b == 5;
    }
}
