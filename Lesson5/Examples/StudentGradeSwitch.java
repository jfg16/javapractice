import java.util.Scanner; 

public class StudentGradeSwitch {
  public static void main(String[] args) {
    //declare variables
    int grade;
    int numberInTrouble = 0;
      
    // Create a Scanner
    Scanner input = new Scanner(System.in);
      
    //Step 1:  Ask user to enter a number the grade 
    //(1 for A, 2 for B, 3 for C, 4 for D, 5 for F)
    System.out.print("Enter the grade (as an integer): ");
      
    //Step 2:  Receive the grade from the keyboard
    grade = input.nextInt();
          
    //Step 3:  Print statement based on the grade entered
    switch(grade) {
        case 1:
        case 2:   System.out.println("Good Work!"); 
          break;
        
        case 3:   System.out.println("Average Work!");  
          break;
        
        case 4:        
        case 5:   System.out.println("Poor Work!");
                  numberInTrouble++;  
          break;
        
        default:  System.out.println(grade + "is not a valid letter grade.");        
    }//end of switch
      
    System.out.println("The total number of students in trouble are: " + numberInTrouble);
      
  }//end of main
}//end of class

