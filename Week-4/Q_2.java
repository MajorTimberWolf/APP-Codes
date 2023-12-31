//Write a JAVA program to guess a number between 1 to 9. Note : User is prompted to enter a guess. 
// If the user guesses wrong then the prompt appears again until the guess is correct, on successful guess, user will get a 
// "Well guessed!" message, and the program will exit.

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetnum = (int) (Math.random() * 9) * 1;
        System.out.println("Guess the number between 1 and 9");

        while (true) {
            System.out.print("Enter your guess: ");
            int userno = scanner.nextInt();

            if(userno == targetnum){
                System.out.println("You guessed it right!");
                break;
            }
            else{
                System.out.println("Your guess is wrong!");
            }
        }
        scanner.close();
    }
}