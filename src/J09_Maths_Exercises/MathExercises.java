package J09_Maths_Exercises;
import java.util.Scanner;

public class MathExercises {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        /*
        double result;

        result = Math.pow(2, 6);
        result = Math.abs(-6);
        result = Math.sqrt(9);
        result = Math.round(3.14);        // rounding up to closet value
        result = Math.ceil(3.14);         // rounding up to Higher value
        result = Math.floor(3.98);          // rounding up to Lower value
        result = Math.max(10, 20);
        result = Math.min(10, 20);

        System.out.println(result);
        */

        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)

        /*

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (Side C) is: " + c + "cm");


         */

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm^2\n", area);
        System.out.printf("The volume is: %.1fcm^3\n", volume);



        scanner.close();
    }
}
