import sorting.bubblesort.*;
import sorting.selectionsort.*;

public class Tutorial6_10 {
    public static void main(String[] args) {
        // Create objects of each class from the packages
        bubblesort bubbleObj = new bubblesort();
        selectionsort selectObj = new selectionsort();

        // Create an array of integers to be sorted
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        // Print the original array
        System.out.println("Original array: ");
        printArray(arr);

        // Perform the bubble sort using the method from the bubbleObj
        bubbleObj.sort(arr);

        // Print the sorted array using bubble sort
        System.out.println("Sorted array using bubble sort: ");
        printArray(arr);

        // Reset the array to its original order
        arr = new int[] { 64, 34, 25, 12, 22, 11, 90 };

        // Perform the selection sort using the method from the selectObj
        selectObj.sort(arr);

        // Print the sorted array using selection sort
        System.out.println("Sorted array using selection sort: ");
        printArray(arr);
    }

    // A helper method to print an array of integers
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}