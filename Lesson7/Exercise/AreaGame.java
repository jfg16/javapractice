import java.util.Scanner;

public class AreaGame{
    
    public static void main (String [ ] args) {
        
        //declare variables & vairables
        int height = 0, width = 0, area = 0, playValue = 0;
        Scanner recta = new Scanner(System.in);
        
        //Welcome
        System.out.println("");
        System.out.println("                    Welcome to the Area Game!                   ");
        
        //do-while loop
        do {
            //ask/read height
            System.out.println("");
            System.out.print("Enter the height of the rectangle: ");
            height = recta.nextInt();
            System.out.println("");
            
            //ask/read width
            System.out.print("Enter the width of the rectangle: ");
            width = recta.nextInt();
            System.out.println("");
            
            //calculate
            area = height * width;
            
            //print results
            System.out.println("The area of the rectangle is " + area);
            System.out.println("");
            
            //ask user
            System.out.print("Do you want to play again? (Enter 0 for no & 1 for yes): ");
            playValue = recta.nextInt();
            
        } while (playValue == 1);
        
        //thank you
        System.out.println("");
        System.out.println("Thank you for playing!");
        
    }//end of main
    
}//end of the class