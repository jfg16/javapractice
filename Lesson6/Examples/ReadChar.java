import java.util.Scanner;

public class ReadChar {
    
    public static void main (String [ ] args) {
        
        //declare variables
        char middleInt = 'L', randomChar = '6';
        
        //declar & create Scanner object
        
        //prompt use for middle initial
        System.out.println("Lower Case Middle Initial: " + Character.toLowerCase(middleInt) );
        
        System.out.println("Is Middle Initial a Digit? " + Character.isDigit(middleInt) );
        
        System.out.println("Is randomChar a letter? " + Character.isLetter(randomChar));
        
    }//end of main
    
}//end of the class