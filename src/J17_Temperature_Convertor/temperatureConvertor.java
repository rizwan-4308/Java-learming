package J17_Temperature_Convertor;

import java.util.Scanner;

public class temperatureConvertor {
    public static void main(String[] args){

        // Temperature Conversion Program

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();    // no need of .nextLine for single character
                                                // toUpperCase : method chaning

        // (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s",newTemp, unit);


        scanner.close();
    }
}
