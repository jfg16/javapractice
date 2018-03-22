import java.util.Scanner;

public class AreaCircle {
    
    public static void main (String [ ] args) {
        
        //Declare variables
        double radius, area;
        
        //Declare constant
        final double PI = 3.14159;
        
        //Create & declare Scanner object (IN)
        Scanner in = new Scanner (System.in);
        
        //Prompt the user for radius
        System.out.print("Please enter the radius: ");
        
        //Read radius
        radius = in.nextDouble();
        
        //Calculate area
        area = radius*radius*PI;
        
        //Print
        System.out.println("The area is: " + area + " with a radius of: " + radius);
        
    }//end of main
    
}//end of the class