import java.util.Scanner;

public class ReadFirstLast {
    
    public static void main (String [ ] args) {
        
        //Declare variables: name (String), age (Int), input (Scanner)
        String fname = "";
        String lname = "";
        
        //Declare and create new Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt user for their full name
        System.out.print( "What is your full name? ");
        
        //Read first name
        fname = keyboard.next();
        
        //Read last name
        lname = keyboard.nextLine();
        
        //Print final message
        System.out.println(lname + " have an awesome day!");
        
    }//end of main
    
}//end of the class