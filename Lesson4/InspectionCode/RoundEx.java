import java.util.Scanner;

public class RoundEx {
    
    public static void main (String [ ] args) {
        
        System.out.println(" Example 1: ceil " + Math.ceil(38.3 ) );
        
        System.out.println(" Example 1: floor " + Math.floor(38.3 ) );
        
        System.out.println(" Example 1: rint " + Math.rint(38.3 ) );
        
        System.out.println(" Example 1: rint " + Math.rint(38.5 ) );
        
        //nested function
        double result;
        
        result = Math.max ( Math.min( 4.5, 4 ), 4.7 );
        
        System.out.println("The result of the nested statement is: " + result);
        
    }//end of main
    
}//end of the class