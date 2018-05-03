/************************************************************************************************
 * File Name:   SeminoleBanking_B.java
 * 
 * Due Date:    04/20/18
 * 
 * Author:      Jonathan Garcia
 * 
 * Program Description:  This program will allow the user to access their bank account and withdraw, deposit, or check balance. 
 * 
 * Input:       balance, deposit, withdrawal, account number, menu choice
 *
 * Output:     balance, account number             
 *
 * Processing:      Store acctnum, calculate new balance after withdrawal/deposit, store new balance, loop bank options until exited
 *              
 * **********************************************************************************************/

import java.util.Scanner;

public class SeminoleBanking_B {
    
    public static void main (String [ ] args) {
        
        //Declarations and Initializations of variables
        int acctnum;
        double balance = 1000, deposit, withdrawal;
        char mchoice;
        Scanner bank = new Scanner(System.in);
        
        //Display welcome messages and Request and Read users’ account number
        System.out.println("\n******************************************************************************");
        System.out.println("\n                          Welcome to Seminole Bank                            ");
        System.out.println("\n******************************************************************************");
        
        System.out.print("Please enter your 5-digit Seminole account number: ");
        acctnum = bank.nextInt();
        System.out.println("\nThank you!");
        System.out.println("");
        
        //Process menu until user enters X (Use a DO-WHILE loop with an “if...else if” OR a “switch” statement!!!!)
        do {
            //Display menu choices and Request and Read the users’ banking choice
            System.out.print("Enter D for deposit, W for withdrawal, B for balance, or X to exit the menu: ");
            mchoice = bank.next().toUpperCase().charAt(0);
            System.out.println("");
            
            switch(mchoice) {
                case 'D':
                    System.out.print("Please enter your deposit amount: ");
                    deposit = bank.nextDouble();
                    balance = balance + deposit;
                    System.out.println("");
                    break;
                case 'W':
                    System.out.print("Please enter your withdrawal amount: ");
                    withdrawal = bank.nextDouble();
                    balance = balance - withdrawal;
                    System.out.println("");
                    break;
                case 'B':
                    System.out.printf("Account number " + acctnum + " has a current balance of: $%.2f", balance); 
                    System.out.println("");
                    break;
                default:
                    System.out.println("ERROR: Please enter D, W, X, or B");
                    System.out.println("");
            }//end of switch
            
        }while(mchoice != 'X'); //end of do while
        
        //Display final message
        System.out.println("Thank you for being a loyal Seminole Bank customer!");
        
    }//end of main
    
}//end of the class