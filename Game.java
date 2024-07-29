import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        while (playAgain)
        {
            int min = 1;
            int max = 100;
            int randomNumber = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            int maxAttempts = 10;
            boolean correctGuess = false;
            System.out.println("Random number: " + randomNumber);
            System.out.println("Guess the number between " + min + " and " +max + ". You have " + maxAttempts + " attempts.");
            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == randomNumber)
                {
                    System.out.println("Congratulations! You guessed the correct number.");
                    correctGuess = true;
                    break;
                } 
                else if (userGuess < randomNumber) 
                {
                    System.out.println("Your guess is too low.");
                } else
                {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!correctGuess) 
            {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + randomNumber);
            }
            System.out.print("Do you want to play again? (1/0): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("1");
        }
        scanner.close();
        System.out.println("Thank you for playing!");
    }
}
