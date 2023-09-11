import java.util.HashMap;

public class Tutorial5_10 {
    public static void main(String[] args) {
        int[] array = { 3, 6, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9 };

        int uniqueCount = countUnique(array);
        System.out.println("Number of unique elements: " + uniqueCount);
    }

    public static int countUnique(int[] array) {
        HashMap<Integer, Boolean> elementCount = new HashMap<>();

        for (int num : array) {
            elementCount.put(num, true);
        }
        return elementCount.size();
    }
}
