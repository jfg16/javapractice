import java.util.Scanner;

public class ParseAnotherString {
    
    public static void main (String [ ] args) {
        
        //declare variables
        String name = "";
        String lname = "";
        String fname = "";
        
        //Create Scanner object 
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt user for full name
        System.out.print("Enter full name: ");
        
        //Read full name
        name = keyboard.nextLine();
        
        //Parse THE STRING using substring() and indexOf();
        
        //find the index of the first space
        space = name.indexOf(" "); //first occurence of space
        
        //first name using chaining in all caps;
        fname = name.substring(0, space ).toUpperCase();
        
        //last name
        lname = name.substring(space + 1).toLowerCase();
        
        //fanciness
        System.out.println("first name: " + fname);
        System.out.println("last name: " + lname);
        System.out.println("index of first space: " + name);
        
    }//end of main
    
}//end of the class