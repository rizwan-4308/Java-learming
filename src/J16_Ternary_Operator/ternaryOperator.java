package J16_Ternary_Operator;

public class ternaryOperator {
    public static void main(String[] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        /*
        int score = 80;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);


        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);


        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        System.out.println(timeOfDay);
         */

        int income = 30000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);

    }
}
