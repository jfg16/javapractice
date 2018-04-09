/************************************************************************************************
 * File Name:   PhoneKeyPad.java
 * 
 * Due Date:    04/06/2018
 * 
 * Author:      Jonathan Garcia
 * 
 * Program Description:  Gives the corresponding number for a phone key pad letter
 * 
 * Input:       letter
 *
 * Output:      number
 *              
 * Processing:  reading letter inputted and returning the corresponding number on a key pad
 *              
 * **********************************************************************************************/

import java.util.Scanner;

public class PhoneKeyPad {
    
    public static void main (String[ ] args) {
        
        //declare variables & Scanner object
        char letter;
        int number = 0;
        Scanner input = new Scanner(System.in);
        
        //display & ask
        System.out.println("\nWelcome to the Phone Key Pad translator!");
        System.out.print("\nEnter an uppercase letter: ");
        
        //read letter
        letter = input.next().toUpperCase().charAt(0);
        
        //switch statment to process corresponding number on key pad
        switch(letter) {
                case 'A':
                case 'B':
                case 'C':
                    number = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    number = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    number = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    number = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    number = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    number = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    number = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    number = 9;
                    break;
                default:
                    System.out.println( letter + " is an invalid input");
        }//end of switch
        
        //display corresponding letter
        System.out.println("");
        System.out.println("The corresponding number is: " + number);
        System.out.println("");
        
    }//end of main
    
}//end of the class