import java.util.Scanner;

public class ReadInt {
    
    public static void main (String [ ] args) {
        
        //declare variables
        int age;
        
        //create Scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user for age
        System.out.print("Please enter your age: ");
        
        //read the age from the keyboard
        age = input.nextInt();
        
        //print user's age
        System.out.println("Your age is: " + age);
        
    }//end of main
    
}//end of the class