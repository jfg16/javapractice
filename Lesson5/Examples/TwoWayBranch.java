import java.util.Scanner;

public class TwoWayBranch {
    
    public static void main (String [ ] args) {
        
        //declare variables
        int value1, value2;
        
        //create and declare scanner object
        Scanner op = new Scanner(System.in);
        
        //prompt user for two integers
        System.out.print("Enter two integers: ");
        
        //read first integer
        value1 = op.nextInt();
        
        //read second integer
        value2 = op.nextInt();
        
        //determine which integer is greater using a branching statement
        //print the largest value
        if (value1 > value2){
            
            System.out.println("Value 1 is greater!!");
            
        } else {
            
            System.out.println("Value 2 is greater!!");
            
        }//end of IF ELSE
        
    }//end of main
    
}//end of the class