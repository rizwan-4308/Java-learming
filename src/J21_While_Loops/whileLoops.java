package J21_While_Loops;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        /*
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old.");
        */

        // do while loop

        /*
        int age = 0;

        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old.");
        */

        int number = 0;

        do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}
