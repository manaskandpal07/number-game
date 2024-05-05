import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100); // Generates a random number between 0 (inclusive) and 100 (exclusive)
        int guess = -1;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 0 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");

        scanner.close();
    }
}
