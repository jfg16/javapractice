import java.util.Scanner;

public class CalculateValues {
    
    public static void main (String [ ] args) {
        //declare variables
        int value1, value2, menuChoice;
        double sum, product, division;
        
        //create Scanner object
        Scanner input = new Scanner (System.in);
        
        //prompt user for value 1
        System.out.print("Enter value 1: ");
        
        //read
        value1 = input.nextInt();
        
        //prompt
        System.out.print("Enter value 2: ");
        
        //read
        value2 = input.nextInt;
        
        //prompt user using a menu for calculation choice
        System.out.println("Which operation would you like to perform?");
        System.out.println("1: Addition");
        System.out.println("2: Multiplication");
        System.out.println("3: Division");
        
        //read menu choice
        menuChoice = input.nextInt();
        
        //Use a Switch to process
        switch( menuChoice ) {
            
        }//end of switch
        
        //calculate 
        
        //print
        
    }//end of main
    
}//end of the class