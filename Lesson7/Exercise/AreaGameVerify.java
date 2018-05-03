import java.util.Scanner;

public class AreaGameVerify
{
    public static void main (String [] args)
    {
        //declare variables
        int height, width, area;  //variables for calculation
        int more; //checks to see if the game should continue
        
        //Display Welcome to the user
        System.out.println ("\nWelcome to the Area Game!\n");
        
        //Object to read input from the user (keyboard)
        Scanner keyboard = new Scanner (System.in);
       
       do {
           //get the width and height from the user
            System.out.print("\nPlease enter the first number (width): ");
            width = keyboard.nextInt();
        
            System.out.print("Please enter the second number (height): ");
            height = keyboard.nextInt();
        
            //calculate the area
            area = width * height;
        
            //Print the results
            System.out.println ("\nThe area of the rectangle is: " + area + "\n");
            
            //Ask the user if they want to continue playing the game
            System.out.print("Do you want to play the Area Game again? ");
            System.out.print("If so type 1 to continue playing and 0 to stop playing: ");
        
            //The users response to playing the game again
            more = keyboard.nextInt();
            
            //Verify that the user entered a valid value (either 1 or 0)
            while (more != 0 && more != 1) {
                //Ask the user to reenter the number
                System.out.print("\nYou have entered an incorrect value!  Please type 1 to continue playing and 0 to stop playing: ");
                more = keyboard.nextInt();

            }//end of nested

          //If the user typed in value 1, repeat the above steps again
        } while (more == 1);
        
        //Thank the user for playing
        System.out.println ("\nThank you for playing the Area Game!  Goodbye! \n");
        
    }//end of main()
}//end of AreaGame class