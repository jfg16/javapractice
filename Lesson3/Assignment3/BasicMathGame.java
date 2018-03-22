/******************************************************************************************************************
 * File Name: BasicMathGame.java
 * Due Date:  02/09/18
 * 
 * Author:  Jonathan Garcia
 * 
 * Program Description:   This program with perform basic mathmatical operations.  
 * 
 * Input:       The user will enter three values:  First name, Value #1 (integer)
 *              and Value #2 (decimal number)
 * 
 * Processing:  Calculate the sum, product, and modulus (remainder).
 * 
 * Output:      Print the sum, product, and modulus to the screen.
 * 
 * ***************************************************************************************************************/

import java.util.Scanner;

public class BasicMathGame
{
    public static void main(String[] args)
    {
        /**********************************************************************************************************
        //Step 1:   Declare SIX Variables - One String and Three doubles (which have been declared and 
        //          initialized for you).  You will need to declare One integer and One double to store the
        //          two values the user enters from the keyboard.
        //
        //Explaination:
                    The String variable will capture the user's first name from the keyboard.  
        //          The three variables declared below will store the results for calculating the sum, 
        //          product and the modulus (remainder).  
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO DECLARE TWO VARIABLES - an integer and a double.
        ***********************************************************************************************************/
        String fname = "";
        double sum = 0, product = 0, modulus = 0;
         
        //INSERT YOUR CODE BELOW
         
        int value1;
        double value2;
         
        /**********************************************************************************************************
        //Step 2:   Print a Welcome Banner to the screen  
        //
        //Task:     THIS STEP HAS BEEN COMPLETED FOR YOU!
        ***********************************************************************************************************/
        
        System.out.println("\n******************************************************************************");
        System.out.println("\n**********************WELCOME TO THE BASIC MATH GAME**************************");
        System.out.println("\n******************************************************************************");
        
          
        /**********************************************************************************************************
        //Step 3:   Create and instantiate a Scanner object called 'input' to accept input from the keyboard.        
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO CREATE A SCANNER OBJECT CALLED 'input'.
        ***********************************************************************************************************/
       
       //INSERT YOUR CODE BELOW. 
        Scanner input = new Scanner(System.in);
        
        /**********************************************************************************************************
        //Step 4:   Prompt the user for their first name.
        //
        //Task:     THIS STEP HAS BEEN COMPLETED FOR YOU!
        ***********************************************************************************************************/
        
        System.out.print("\nPlease enter your first name: ");
        
        /**********************************************************************************************************
        //Step 5:   (INPUT) Read the user's first name from the keyboard.
        //
        //HINT:     The nextLine() or next() methods are needed.  Use the Scanner object 'input' to invoke
        //          or call the Scanner method and assign it to the variable declared above that will store the 
        //          user's first name - 'fname'.
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO READ THE USER'S FIRST NAME FROM THE KEYBOARD AND 
        //          ASSIGNS THAT VALUE TO VARIABLE 'fname'.
        ***********************************************************************************************************/
        
        //INSERT YOUR CODE BELOW. 
        fname = input.nextLine();
        
        /**********************************************************************************************************
        //Step 6:   Prompt the user for two numbers, an integer and a decimal number.
        //
        //Task:     THIS STEP HAS BEEN COMPLETED FOR YOU!
        ***********************************************************************************************************/ 
        
        System.out.println("\n\nWelcome " + fname + "!\n");
        
        System.out.println("******************Let's Begin the Basic Math Game!****************************\n\n");
        
        System.out.println("Please enter your first number (an integer) and your second number (a decimal) ");
        System.out.print("separated by a space on this line then press ENTER: ");


        /**********************************************************************************************************
        //Step 7:   (INPUT) Read the user's two values from the keyboard. 
        //
        //HINT:     The nextInt() and nextDouble() methods are needed.  Use the Scanner object 'input' to invoke
        //          or call these Scanner methods and assign each to the variables YOU declared above.
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO READ THE USER'S TWO VALUES FROM THE KEYBOARD AND
        //          ASSIGNS EACH VALUE TO THE VARIABLES YOU DECLARED ABOVE.
        ***********************************************************************************************************/    
        
        //INSERT YOUR CODE BELOW.   
        value1 = input.nextInt();
        value2 = input.nextInt();
        
        /**********************************************************************************************************
        //Step 8: (PROCESSING) Calculate the summation, product and modulus of the two numbers and then
        //                     store each result in the appropriate variables.
        //
        //HINT:   Don't forget to assign the result of each calculation to a variable using the 
        //        (=) assignment operator.
        //
        //Task:   COMPLETE THIS SECTION BY WRITING THE CODE TO CALCULATE THE PRODUCT AND MODULUS.
        ***********************************************************************************************************/ 

        sum = value1 + value2;
        
        //INSERT YOUR CODE BELOW        
        product = value1 * value2;
        modulus = value1 % value2;
        
        /**********************************************************************************************************
        //Step 9:   (OUTPUT) Display the results to the screen.  
        //                 
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO PRINT THE PRODUCT AND MODULUS.
        ***********************************************************************************************************/  
        
        System.out.print("\n\nThe sum of the two numbers is: ");
        System.out.println(sum);
        
        //INSERT YOUR CODE BELOW
        System.out.print("\n\nThe product of the two numbers is: ");
        System.out.println(product);
        System.out.print("\n\nThe modulus of the two numbers is: ");
        System.out.println(modulus);
        
        /**********************************************************************************************************
        //Step 10:  (OUTPUT) Display the closing statement for the game, which includes the user's name.
        //
        //Task:     THIS STEP HAS BEEN COMPLETED FOR YOU!
        ***********************************************************************************************************/ 
        
        System.out.println("\n\n*****************************************************************************");
        System.out.println("\n              **THANK YOU " + fname.toUpperCase() + " FOR PLAYING THE BASIC MATH GAME**");
        System.out.println("\n******************************************************************************");
        
    }//end of main()
    
}//end of BasicMathGame class
