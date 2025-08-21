package J22_Number_Guessing_Game;

import java.util.Random;
import java.util.Scanner;

public class numberGiessingGame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        /*
        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);

        do{
            System.out.println("NUMBER GUESSING GAME");
            System.out.println("Guess a number between 1 - 10: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " +attempts);
            }
        } while(guess != randomNumber);
         */

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " +attempts);
            }
        } while(guess != randomNumber);


        scanner.close();
    }
}
