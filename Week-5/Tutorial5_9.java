public class Tutorial5_9 {
    public static void main(String[] args) {
        printAllCombinations();
    }

    public static void printAllCombinations() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++)
                    System.out.println(i + " " + j + " " + k);
            }
        }
    }

}
