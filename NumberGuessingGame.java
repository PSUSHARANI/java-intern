import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[]args){
        Random random=new Random();
        int numberToGuess=random.nextInt(100)+1;
        int attempts=0;
        int maxAttempts=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("you have"+maxAttempts+"attempts to guess the number.");
        while(attempts<maxAttempts){
            System.out.print("Enter your guess:");
            int userGuess=sc.nextInt();
            attempts++;
            if(userGuess<numberToGuess){
                System.out.println("Too low!Try again.");
            }
            else if(userGuess>numberToGuess){
                System.out.println("Too high!Try again.");
            }
            else{
                System.out.println("Congrations! You guessed the number in "+attempts+"attempts.");
                break;
            }
        }
        if(attempts==maxAttempts){
            System.out.println("Sorry,you didn't guess the number.It was"+numberToGuess+".");
        }
        sc.close();
    }
}