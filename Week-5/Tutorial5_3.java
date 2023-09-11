import java.util.*;
public class Tutorial5_3 {
    void printEven(int[] array) {
        System.out.println("The even numbers: ");
        for(int i=0;i<array.length;i++) {
            if(array[i]%2==0) {
                System.out.print(array[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no. of elements: ");
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++) {
                array[i] = sc.nextInt();
            }
            Tutorial5_3 obj = new Tutorial5_3();
            obj.printEven(array);
        }
    }
}
