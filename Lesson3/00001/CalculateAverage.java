import java.util.Scanner;

public class CalculateAverage {
    
    public static void main (String [ ] args) {
        
        //Declare variables
        double value1, value2, value3, average;
        
        //Declare and create Scanner object
        Scanner love = new Scanner (System.in);
        
        //Prompt the user for 3 values
        System.out.print("Please enter three values(seperated by a space): ");
        
        //Read the 3 values
        value1 = love.nextDouble();
        value2 = love.nextDouble();
        value3 = love.nextDouble();
        
        //Calculate the average of values
        average = (value1+value2+value3) / 3;
        
        //Print the average to the console
        System.out.println("The average of the values are: " + average);
        
        
    }//end of main
    
}//end of the class