import java.util.Scanner;

public class ReadName {
    
    public static void main (String [ ] args) {
        
        //Declare variables: name (String), age (Int), input (Scanner)
        int age;
        String name = ""; //Initializing a String to the empty String
        
        //Declare and create new Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt user for their name
        System.out.print( "What is your name? ");
        
        //Read user name from keyboard
        name = input.nextLine();
        //^^^^ or Read the first name ONLY from the keyboard
        //**********name = input.next();**********
        
        //Prompt user for their age
        System.out.print( "How old are you? ");
        
        //Read user's age
        age = input.nextInt();
        
        //Print final message
        System.out.println( "Thanks " + name + "!");
        
    }//end of main
    
}//end of the class