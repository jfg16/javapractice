/************************************************************************************************
 * File Name:   InvoiceCalculator.java
 * 
 * Due Date:    03/16/2018
 * 
 * Author:      Jonathan Garcia
 * 
 * Program Description:  The Invoice Calculator will calculate the discount percent, discount amount and total, when given the subtotal and customer type. This is possible through the switch and if/else statements.
 * 
 * Input:       Subtotal & Customer Type
 *
 * Output:      Subtotal, customer type, discount amount, discount percentage, and total
 *              
 * Processing:  Assign discount percentage based on customer type, calculate discount amount, and calculate total
 *              
 * **********************************************************************************************/
 
import java.util.Scanner;
 
public class InvoiceCalculator
{
        public static void main(String[] args)
        {
            //Declare variables and Scanner object
              double total, discAmt, subtotal;
              double discPer = 0.0;
              int custype;
              Scanner inv = new Scanner(System.in);
              
            //Display a application title to screen
             System.out.println("\n******************************************************************************");
             System.out.println("\n                   Seminole Total Invoice Calculator                          ");
             System.out.println("\n******************************************************************************");
             System.out.println();

            //Prompt user for customer type
            System.out.print("Enter customer type (1 for Bronze, 2 for Silver, 3 for Gold, 4 for Platinum): ");
            
            //Read customer type
            custype = inv.nextInt();
            System.out.println();
            
            //Prompt user for subtotal
            System.out.print("Enter the subtotal: ");
            
            //Read subtotal
            subtotal = inv.nextDouble();
            System.out.println();
            
            //Calculate Discount Rate (using a control statement)
            switch(custype) {
                case 1: 
                    if(subtotal<300) {
                        discPer = .05;
                    }
                    else if (300<=subtotal && subtotal<500) {
                        discPer = .1;
                    }
                    else if (500<=subtotal && subtotal<1000) {
                        discPer = .15;
                    }
                    else if (1000<=subtotal) {
                        discPer = .2;
                    }break;
                case 2:
                        discPer = .3;
                        break;
                case 3:
                    if(subtotal<2000) {
                        discPer = .4;
                    }
                    else if (2000<=subtotal && subtotal<5000) {
                        discPer = .5;
                    }
                    else if (5000<=subtotal) {
                        discPer = .6;
                    }break;
                case 4:
                        discPer = .6;
                        break;
                default:
                    if(subtotal<300) {
                        discPer = .05;
                    }
                    else if (300<=subtotal && subtotal<500) {
                        discPer = .1;
                    }
                    else if (500<=subtotal && subtotal<1000) {
                        discPer = .15;
                    }
                    else if (1000<=subtotal) {
                        discPer = .2;
                    }break;
            }//end of switch
            
            //Calculate the Discount Amount
            discAmt = subtotal * discPer;
            
            //Calculate Invoice Total
            total = subtotal - discAmt;
            
            //Format and display the results
            System.out.println("\n******************************************************************************");
            System.out.println("\n                            INVOICE REPORT                                    ");
            System.out.printf("\n                     Subtotal:\t\t\t " + subtotal);
            System.out.printf("\n                     Customer Type:\t\t " + custype);
            System.out.printf("\n                     Discount Percent:\t\t " + discPer);
            System.out.printf("\n                     Discount Amount:\t\t %.2f", discAmt);
            System.out.printf("\n                     Total:\t\t\t %.2f", total);
            System.out.println("\n******************************************************************************");
            
            //Display thank you message
            System.out.println("\n                               Thank You!                                     ");
            System.out.println("\n******************************************************************************");


        }//end of main
}//end of InvoiceCalculator class