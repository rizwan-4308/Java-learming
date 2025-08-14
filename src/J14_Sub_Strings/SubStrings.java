package J14_Sub_Strings;
import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args){

        //substring() = A method to extract a portion of a string
        //          .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        /*
        String email = "rizwan123@gmail.com";
        String username = email.substring(0, 9);
        String domain = email.substring(10);        // email.substring(10, 19)

        System.out.printf("username: %s\n", username);
        System.out.printf("domain: %s\n", domain);
        */

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.printf("username: %s\n", username);
            System.out.printf("domain: %s\n", domain);
        }
        else{
            System.out.println("Emails must contain @");
        }

        scanner.close();
    }
}
