import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        String playAgain;
        System.out.println("Welcome to the Number Guessing Game!");
        do {
            int min = 1;
            int max = 100;
            int maxAttempts = 5;
            int randomNumber = random.nextInt(max - min + 1) + min;
            boolean guessedCorrectly = false;
            System.out.println("\nGuess a number between " + min + " and " + max);
            System.out.println("You only have " + maxAttempts + " attempts!");
            for (int attempts = 1; attempts <= maxAttempts; attempts++) {
                System.out.println("\nAttempt " + attempts + " of " + maxAttempts);
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                int remainingAttempts = maxAttempts - attempts;
                if (guess == randomNumber) {
                    System.out.println("🎉 Correct! You guessed the number.");
                    int roundScore =  remainingAttempts + 1;
                    totalScore += roundScore;
                    System.out.println("⭐ Round Score: " + roundScore);
                    guessedCorrectly = true;
                    break;
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
                if (remainingAttempts > 0) {
                    System.out.println("⏳ Remaining Attempts: " + remainingAttempts);
                }
            }
            if (!guessedCorrectly) {
                System.out.println("\nYou lost this round!");
                System.out.println("The correct number was: " + randomNumber);
            }
            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));
        System.out.println("\n🏆 Game Over!");
        System.out.println("⭐ Final Score: " + totalScore);
        sc.close();
    }
}
