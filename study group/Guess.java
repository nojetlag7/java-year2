import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(100)+1;

        System.out.println("I'm thinking of a number between 1 and 100 inclusive. Can you guess it?");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number:");
        int guess = input.nextInt();
        input.close();
        int miss = Math.abs(number - guess);
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of was: " + number);

        if(guess<number){
            System.out.println("You were below by: " + miss + "\nYou lose!");
        }
        else if(guess>number){
            System.out.println("You were above by: " + miss + "\nYou lose!") ;

        }
        else{
            System.out.println("You guessed it!Congrats!");
        }
    }
}
