package J20_Logical_Operators;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args){

        /*
        // && = AND
        // || = OR
        // ! = NOT

        double temp = -5;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is SUNNY outside ☁️");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is CLOUDY outside ☁️");
        }
        else if(temp >30 || temp < 0){
            System.out.println("The weather is BAD 😒");
        }
        */

        Scanner scanner = new Scanner(System.in);

        // username must be between4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("username must be between 4-12 charcters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username must not contain any spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
