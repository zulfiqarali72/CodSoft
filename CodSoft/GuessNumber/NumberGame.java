    import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class NumberGame {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have to guess a number between " + minRange + " and " + maxRange);

        while (true) {
            int numberToGuess = (int) (Math.random() * (maxRange - minRange + 1)) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Round " + (rounds + 1));
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Try a higher number. Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Try a lower number. Attempts left: " + (maxAttempts - attempts));
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }

            rounds++;
        }

        System.out.println("Game Over!");
        System.out.println("Total rounds played: " + (rounds + 1));
        System.out.println("Total attempts: " + totalAttempts);
    }
}

