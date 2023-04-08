import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt)
{
    String retString = "";  // Set this to zero length. Loop runs until it isn’t
    do
    {
        System.out.print("\n" +prompt + ": "); // show prompt add space
        retString = pipe.nextLine();
    }while(retString.length() == 0);

    return retString;
}
    public static int getInt(Scanner pipe, String prompt){ //this is setting the int steps for any main that uses getInt

    int retVal = 0;
    String trash = ""; //trash incorrect variables
    boolean done = false;

    do{
        System.out.println(prompt);
        if(pipe.hasNextInt()){
            retVal = pipe.nextInt();
            pipe.nextLine();
            done = true;
        }
        else{
            trash = pipe.nextLine();
            System.out.println("Not correct type: "+ trash); //when varible is incorrect like "acvef" instead of 1,2,3
        }
    }while(!done); //not done it will loop back

    return retVal;
    }
    public static double getDouble(Scanner pipe, String prompt){ //this is setting the double variable

        double retVal = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.println(prompt);
            if(pipe.hasNextDouble()){
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.println("Not correct type: "+ trash);
            }
        }while(!done);

        return retVal;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        boolean hasGoodInput = false;
        int input = 0;
        do {
            //System.out.print("%s between %d and %d: ", prompt, low, high);
            if(pipe.hasNextInt()) {
                input = pipe.nextInt();
                if(input >= low && input <= high) {
                    hasGoodInput = true;
                }
                else {
                    if(input < low) {
                        System.out.println("The number you entered was below the acceptable range. Please try again");
                    }
                    else {
                        System.out.println("The number you entered was above the acceptable range. Please try again");
                    }
                }
            }
            else {
                System.out.println("You did not enter an integer. Please try again.");
            }
            pipe.nextLine();
        } while(!hasGoodInput);
        return input;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean hasGoodInput = false;
        double input = 0;
        do {
            System.out.print(prompt +" between " + low + " and " + high + ": ");
            if(pipe.hasNextDouble()) {
                input = pipe.nextDouble();
                if(input >= low && input <= high) {
                    hasGoodInput = true;
                }
                else {
                    if(input < low) {
                        System.out.println("The number you entered was below the acceptable range. Please try again");
                    }
                    else {
                        System.out.println("The number you entered was above the acceptable range. Please try again");
                    }
                }
            }
            else {
                System.out.println("You did not enter an double. Please try again.");
            }
            pipe.nextLine();
        } while(!hasGoodInput);
        return input;
    }

    public static boolean getYNComfirm(Scanner pipe, String prompt) {

        boolean confirm = false;

        char input;

        System.out.print(prompt + " (Y/N): ");

        input = pipe.nextLine().toLowerCase().charAt(0);

        if(input == 'y') {

            confirm = true;
        }
        return confirm;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern){

        String retVal = "";
        boolean gotAValue = false;

        do{
            System.out.print(prompt + ": "); //show the prompt
                retVal= pipe.nextLine(); //input the data
            if(retVal.matches(regExPattern)){ //this test and references String regExPattern
                gotAValue = true;
            }
            else {
                System.out.println("\nInvalid input: " + retVal); //Output incorrect variable
            }

        }while(!gotAValue);

        return retVal;
    }


}
