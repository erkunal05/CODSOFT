import java.util.Random;
import java.util.Scanner;

class guessinggame{
    public static void main(String[] args) {
        Random ref = new Random();
        int numberToGuess = 1+ ref.nextInt(100);
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
           int guess = read.nextInt();

            if (guess == numberToGuess)
            {
                System.out.println("Congratulations! You Guessed The Correct Number.");
                break;
            } 
        else if (guess < numberToGuess) 
            {
                System.out.println("Number You Guess Is Too Small. Please Try Again: ");
            } 
        else 
            {
                System.out.println("Number You Guess Is Too Large. Please Try Again: ");
            }
        }
    }
}