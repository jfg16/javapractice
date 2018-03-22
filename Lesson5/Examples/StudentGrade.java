import java.util.Scanner; 

public class StudentGrade {
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
    if (grade == 1 || grade == 2)
      System.out.println("Good Work!");

    else if (grade == 3) {
      System.out.println("Average Work!");
    }
    
    else if (grade == 4 || grade == 5) {
      System.out.println("Poor Work!");
      numberInTrouble++;
    }
    else
      System.out.println(grade + "is not a valid letter grade.");
      
    System.out.println("The total number of students in trouble are: " + numberInTrouble);
  }//end of main
}//end of class

