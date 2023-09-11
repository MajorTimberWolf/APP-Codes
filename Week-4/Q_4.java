//Write a JAVA program that accepts a word from the user and reverse it. ( should not use any functions)

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object to read user input
        System.out.print("Enter a word: "); // prompt the user to enter a word
        String word = scanner.nextLine(); // read the word from the user
        scanner.close(); // close the scanner object

        String reversed = ""; // create an empty string to store the reversed word
        for (int i = word.length() - 1; i >= 0; i--) { // loop from the last character to the first character of the word
            reversed += word.charAt(i); // append the current character to the reversed string
        }
        System.out.println("The reversed word is: " + reversed); // print the reversed word
    }
}

