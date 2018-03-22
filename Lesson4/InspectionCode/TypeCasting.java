import java.util.Scanner;

public class TypeCasting {
    
    public static void main (String [ ] args) {
        
        //declare variables
        double num1;
        int num2;
        
        //initialize variables
        
        //Example: implicit type casting (type widening)
        //Smalller data type to a larger data type
        num1 = 100;
        
        System.out.println("Num 1 is: " + num1);
        
        //Example: explicit type casting (type narrowing)
        //Larger data type to a smaller data type
        //The type casting operator is needed
        num2 = (int) 106.9873;
        
        System.out.println("Num 2 is: " + num2);
        
    }//end of main
    
}//end of the class