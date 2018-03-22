import java.util.Scanner;

public class PrintFormat {
    
    public static void main (String [ ] args) {
        
        //declare and initialize
        double total = 37.59818739868263401;
        
        //print total using the printf method for fomatting output
        // \n creates a new line \t tabs
        System.out.printf( "The total is: %.2f \n", total);
        System.out.printf( "\t\tThe total is: %.5f\n", total);
        
    }//end of main
    
}//end of the class