/*************************************************************************
 * File Name: LoanFutureValue.java
 * 
 * Due Date:  02/23/18
 * 
 * Author:  Jonathan Garcia
 * 
 * Program Description:   This a program meant to calculate the future investment value, by gathering the investment amount, annual interest rate, and number of years.
 * 
 * Input:       investmentAmount, annualInterestRate, numberOfYears
 *              
 * Processing:  calculate monthlyInterestRate & futureInvestmentValue 
 * 
 * Output:      futureInvestmentValue
 * 
 * ***********************************************************************/

import java.util.*;

public class LoanFutureValue {
  public static void main(String[] args) {
    
    //Declare variables
    double investmentAmount, annualInterestRate, monthlyInterestRate, futureInvestmentValue;
    int numberOfYears;
    
    //Create Scanner Object
    Scanner var = new Scanner(System.in);

    // Step #1:  Display program header which includes the title
    System.out.println("\n******************************************************************************");
    System.out.println("\n                       Accumulated Investment Value                           ");
    System.out.println("\n******************************************************************************");
    System.out.println();
      
    // Step #2:  Prompt the user to enter the investment amount
    System.out.print("Enter the investment amount (for example 120000.95): ");
    
    // Step #3:  Read investment amount
    investmentAmount = var.nextDouble();
    System.out.println();
    
    // Step #4:  Prompt the user to enter the yearly interest rate
    System.out.print("Enter the annual interest rate (for example 8.25): ");
    
    // Step #5:  Read yearly interest rate
    annualInterestRate = var.nextDouble();
    System.out.println();
    
    // Step #6:  Prompt the user to enter the number of years
    System.out.print("Enter the number of years (for example 5): ");
   
    // Step #7:  Read number of years 
    numberOfYears = var.nextInt();
    System.out.println();
    
    // Step #8:  Calculate monthly interest rate
    monthlyInterestRate = (annualInterestRate / 1200);
    
    // Step #9:  Calculate the Future Value
    futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
    
    // Step #10:  Display the future investment value
    System.out.println("\n******************************************************************************");
    System.out.println("\n                  The future value is: " + futureInvestmentValue);
    System.out.println("\n******************************************************************************");

  }//end of main method
  
}//end of LoanFutureValue class