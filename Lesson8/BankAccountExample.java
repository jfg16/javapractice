/************************************************************************************************
 * File Name:   BankAccountStudent.java
 * 
 * Due Date:    <ENTER THE DATE>
 * 
 * Author:      <ENTER YOUR NAME>
 * 
 * Program Description:  
 *              <ENTER A DESCRIPTION>  
 * 
 * Input:       <ENTER A INPUT INFORMATION>  
 *
 * Output:      <ENTER A OUTPUT INFORMATION>  
 *
 * Processing:  <ENTER A PROCESSING INFORMATION>  
 * **********************************************************************************************/

import java.util.Scanner;

public class BankAccountExample{
    

        //Main Function
        public static void main(String []args){
                
                //Declare local variables that ONLY main() knows about
                int acctnum;
                
                //Function Call Statement for welcomemessage
                //return type is void
                welcomeMessage();
                
                //Function call statment for the accountInfo()
                //return type of int
                acctnum = accountInfo();
                
                //testing
               //System.out.println("Here is the account Number: " + acctnum)
               
               do{
                       //prompt menu choice
                       
                       //read menu choice
                       
                       //processed menu choice using if/else or switch
               }
            
        }//end of main

         //Function Definition for the welcome message
         public static void welcomeMessage(){             
                 
                System.out.println("\n******************************************************************************");
                System.out.println("\n                          Welcome to Seminole Bank                            ");
                System.out.println("\n******************************************************************************");
            
         }//end of welcomeMessage
         
         //Function Definition for the accountInfo()
         public static int accountInfo(){
                 
                Scanner bank = new Scanner(System.in);
                
                //prompt for acctnum
                System.out.print("Please enter your 5-digit Seminole account number: ");
                
                //read accountnum
                int acctnum = bank.nextInt();
                
                //return
                return acctnum;
                
         }//end of acountinfo
         
        //--

    
}//end of BankAccount Class

