import java.util.Scanner;

public class CalculateSum {
    
    public static void main (String [ ] args) {
        
        //call statement for the sum function
        //NOT storing the VALUE IN MEMORY
        //System.out.println("The sum is: " + sum(1, 114) );
        
        //Call the sum method & store the return value in memory
        int sumOfValues = sum(25, 47);
        
        //Call th eprintSum method to print sum to the screen
        printSum();
        
    }//end of main
    
    //Function definition for the sum method
    public static int sum (int num1, int num2) {
        
        //local variabl
        int sum;
        
        //calculate the sum
        sum = num1 + num2;
        
        return sum;
        
    }//end of sum method
    
    //function is used to print a message to the screen
    public static void printStatement (int sumResult){
        
        System.out.println("The sum is: " + sumResult);
    }
    
}//end of the class