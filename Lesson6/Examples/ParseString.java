import java.util.Scanner;

public class ParseString {
    
    public static void main (String [ ] args) {
        
        //declare variables
        String lName= "", fName = "", mName = "";
        char middleInit;
        
        //Create Scanner object
        Scanner read = new Scanner(System.in);
        
        //Prompt user for FUll Name
        System.out.print("Please enter full name: ");
        
        //Read first name
        fName = read.next();
        
        //read middle name
        mName = read.next();
        
        //read last name
        lName = read.next();
        
        //print statements
        System.out.println("Your first name is " + fName + ", your middle name is " + mName + ", and your last name is " + lName);
        
        System.out.println("Last name in caps: " + lName.toUpperCase());
        
        System.out.println("Middle Initial is " + mName.charAt(0) + ".");
        
        System.out.println("Length of first name " + fName.length());
        
    }//end of main
    
}//end of the class