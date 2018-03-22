import java.util.Scanner;

public class ScannerError {
    
    public static void main (String [ ] args) {
        
        //declare variables
        int age;
        double gpa;
        String city;
        
        //declare and create Scanner object
        Scanner key = new Scanner(System.in);
        
        //prompt user for age and gpa
        System.out.print("Please enter your age and gpa: ");
        
        //read age 
        age = key.nextInt();
        
        //read gpa
        gpa = key.nextDouble();
        
        //flush the input stream buffer
        key.nextLine();
        
        //Print age & gpa to console
        System.out.println("You are " + age + " years old with a gpa of " + gpa);
        
        //prompt user for birth city
        System.out.println("Where were you born? ");
        
        //read city
        city = key.nextLine();
        
        //print city age & gpa
        System.out.println(city + " is a great city!");
        
    }//end of main
    
}//end of the class