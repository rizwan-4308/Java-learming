package Variables;

public class VariablesExamples {
    public static void main(String[] args){

        // variables: Primitive & Reference
        //steps: 1. declaration 2. assignment

        //int age;
        int age = 25;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = - 12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Md Rizwan";
        String food = "pizza";
        String email = "rizwan123@gmail.com";
        String car = "Mustang";
        String color = "Red";


        //System.out.println("The year is: " + year);
        //System.out.println("$ " + price);
        //System.out.println(grade);
        //System.out.println(symbol);
        //System.out.println(currency);
        //System.out.println(isStudent);

        /*if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }
         */

        //System.out.println(name);
        //System.out.println("Hello " + name);
        //System.out.println("Your favourite food is " + food);
        //System.out.println("Your email is " + email);

        /*
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
         */
        //System.out.println("Your choice is a " + color + year + car);
        //System.out.println("Your choice is a " + color + " " +year + " " + car);
        //System.out.println("The price is : " + currency + " " + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }


    }
}
