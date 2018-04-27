/************************************************************************************************
 * File Name:   BankAccountStudent.java
 * 
 * Due Date:    04/27/18
 * 
 * Author:      Jonathan Garcia
 * 
 * Program Description:  Create a bank account application, using the top down function method 
 * 
 * Input:       balance, deposit, withdrawal, account number, menu choice 
 *
 * Output:      balance, account number  
 *
 * Processing:  Store acctnum, call functions (at times with variables), calculate new balance after withdrawal/deposit, store new balance, loop bank options until exited
 *                
 * **********************************************************************************************/

import java.util.Scanner;

public class BankAccount{
    

        //Main Function
        public static void main(String []args){
        
                //Declare Scanner object(s)
                //Declare other variables as needed
                //Declare and initialize a variable for balance to $5000.
                int acctnum;
                double balance = 5000, deposit, withdrawal;
                char mchoice;
                Scanner bank = new Scanner(System.in);
         
                //Display the welcome message -  (HINT:  This method does NOT require a value returned!)
                //Call the welecomeMessage() function
                welcomeMessage();
                
                //Prompt the user to enter the account number 
                //HINT:  The account number must be returned to main()!  In main(), don’t forget to assign the call statement to a variable.
                //Call the accountInfo() function
                acctnum = accountInfo();
            
         
                //Process menu using a Do-While loop and Switch statement
                //This will Display the menu and Call the Function(s) based on the user's choice until the user enters X 

                do{
                        //Call the function to display the menu and prompt the user for their choice 
                        //HINT:  The displayMenu() function must return the choice back to main()!  In main(), don’t forget to assign the call statement to a variable.
                        //Call the displayMenu() function
                        
                        mchoice = displayMenu();
                        
                        //Start the switch() statement to determine which function is called based on the user’s choice
                        //HINT:  Each case calls or invokes a function to perform some specific task

                        switch(mchoice){
                                //Case (If the menu choice is D)
                                //Call the depositFunds(balance) function and assign it to a variable
                                case 'D':
                                    balance = depositFunds(balance);
                                    break;
                                //Case (If the menu choice is W)
                                //Call the withdrawFunds(balance) function and assign it to a variable
                                case 'W':
                                    balance = withdrawFunds(balance);
                                    break;
                                //Case (If the menu choice is B)
                                //Call the checkBalance(account number, balance) function
                                case 'B':
                                    checkBalance(acctnum, balance);
                                    System.out.println("");
                                    break;
                                //Case (If the menu choice is X)
                                case 'X':
                                    break;
                                //Default for user error handling
                                default:
                                    System.out.println("ERROR: Please enter D, W, X, or B");
                                    System.out.println("");
                        }//end of switch     
             
                }while(mchoice != 'X');  
                
            //Display final message
            System.out.println("Thank you for being a loyal Seminole Bank customer!");
            
        }//end of main
        
             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/

         //Display welcome message 
         public static void welcomeMessage(){             
                 System.out.println("\n******************************************************************************");
                 System.out.println("\n                          Welcome to Seminole Bank                            ");
                 System.out.println("\n******************************************************************************");
             
         }//end of welcomeMessage
         
         //Prompt and Read users’ account number.  RETURN the account number to main().
         public static int accountInfo (){
                
                Scanner bax = new Scanner(System.in);
                
                //prompt for acctnum
                System.out.print("Please enter your 5-digit Seminole account number: ");
                
                //read accountnum
                int acctnum = bax.nextInt();
                
                //display thank you message
                System.out.println("\nThank you!");
                System.out.println("");
                
                //return
                return acctnum;
             
         }//end of accountInfo
         
        
         //Display menu choices to the user and Read the users’ banking choice.  RETURN the user’s menu choice to main().
         public static char displayMenu (){
                 
                 Scanner bak = new Scanner(System.in);
                 
                 System.out.print("Enter D for deposit, W for withdrawal, B for balance, or X to exit the menu: ");
                 
                 char mchoice = bak.next().toUpperCase().charAt(0);
                 
                 System.out.println("");
                 
                 //return to Main()
                 return mchoice;
             
         }//end of displayMenu
         
         
         //Prompt the user for the amount to deposit and Read deposit amount.  Update the balance and RETURN the balance to main().
         public static double depositFunds(double balance){
                 
                 Scanner bal = new Scanner(System.in);
                 
                 System.out.print("Please enter your deposit amount: ");
                 
                 double deposit = bal.nextDouble();
                 
                 balance = balance + deposit;
                 
                 System.out.println("");
                 
                 //return & update balance
                 return balance;
                 
         }//end of depositFunds
         
    
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  Update the balance and RETURN the balance to main().
         public static double withdrawFunds (double balance){
                 
                 Scanner ban = new Scanner(System.in);
                 
                 System.out.print("Please enter your withdrawal amount: ");
                 
                 double withdrawal = ban.nextDouble();
                 
                 balance = balance - withdrawal;
                 
                 System.out.println("");
                 
                 //update & return
                 return balance;
                 
         }//end of withdrawFunds
     
         //Display the balance and DO NOT RETURN anything to main().
         public static void checkBalance(int acctnum, double balance){
                 
                 System.out.printf("Account number " + acctnum + " has a current balance of: $%.2f", balance); 
                 
         }//end of checkBalance
                  
        /**************************************************END OF FUNCTION DEFINITIONS **************************************************/
    
    
}//end of BankAccount Class

