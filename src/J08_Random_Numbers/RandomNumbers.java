package J08_Random_Numbers;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double number;
        boolean isHeads;

        /*
        number1= random.nextInt(1, 7);
        number2= random.nextInt(1, 7);
        number3= random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
         */

        number = random.nextDouble(0, 1);
        isHeads = random.nextBoolean();

        //System.out.println(number);
       // System.out.println(isHeads);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }



    }
}
