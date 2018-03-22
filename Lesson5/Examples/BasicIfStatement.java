import java.util.Scanner;

public class BasicIfStatement {
    
    public static void main (String [ ] args) {
        
        //Declare variables
        int num1, num2;
        
        //Create and declare Scanner object
        Scanner tan = new Scanner(System.in);
        
        //Prompt user for Num1
        System.out.print("Please enter value for num1: ");
        
        //Read num1
        num1 = tan.nextInt();
        
        //Prompt user for Num2
        System.out.print("Please enter value for num2: ");
        
        //Read num2
        num2 = tan.nextInt();
        
        //Compare numbers using a branching statement
        //Print if Num2 is greater than is Num1
        if( num2 > num1 ) {
            System.out.println("Number 2 is greater than Number 1!");
        } //end of IF statement
        
        System.out.println("GOODBYE");
        
    }//end of main
    
    
}//end of the class