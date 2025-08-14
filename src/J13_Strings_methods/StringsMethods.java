package J13_Strings_methods;

public class StringsMethods {
    public static void main(String[] args){

        //String name = " Md Rizwan ";
        String name = "Password";


        int length = name.length();
        char letter = name.charAt(3);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf(" ");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("w", "v");


        //System.out.println(length);
        //System.out.println(letter);
        //System.out.println(index);
        //System.out.println(lastIndex);
        //System.out.println(name);
        //System.out.println(name.isEmpty());

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }
        */

        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space/spaces");
        }
        else{
            System.out.println("Your name doesn't contains any spaces");
            }

         */

        //if(name.equals("password")){
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("hello "+ name);
        }
    }

}
