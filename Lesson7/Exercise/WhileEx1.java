import java.util.Scanner;

public class WhileEx1 {
    
    public static void main (String [ ] args) {
        
        //initialize control variable
        int count = 0;
        
        //start the while loop
        //boolean expression that involves that control variable
        while(count<20) {
            System.out.println("MY birthday is Sept 22 & the value of count is: " + count);
            
            //update the value of the control variable
            count++;
        }//end of while loop
        
        System.out.println("OUTSIDE OF THE WHILE LOOP");
        
    }//end of main
    
}//end of the class