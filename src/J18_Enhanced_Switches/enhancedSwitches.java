package J18_Enhanced_Switches;

import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args){

        // Enhanced switch = a replacement to many else if statements

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        /*
        switch(day){
            case "Monday" -> System.out.println("It is a week day 😣");
            case "Tuesday" -> System.out.println("It is a week day 😣");
            case "Wednesday" -> System.out.println("It is a week day 😣");
            case "Thursday" -> System.out.println("It is a week day 😣");
            case "Friday" -> System.out.println("It is a week day 😣");
            case "Saturday" -> System.out.println("It is the weekend 😊");
            case "Sunday" -> System.out.println("It is the weekend 😊");
            default -> System.out.println(day + " is not a day");
        }
         */

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a week day 😣");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend 😊");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
