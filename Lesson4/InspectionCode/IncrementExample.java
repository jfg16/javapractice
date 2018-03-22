import java.util.Scanner;    // needed to use Scanner for input

public class IncrementExample {
   public static void main(String[] args) {
      
        //Declare and initialize variables  
        int apple = 6;
        int ball = apple++;
       
        //Print current values of varibles       
        System.out.println(apple);
        System.out.println(ball);
       
        //Initialize variables to new values
        apple = 6;
        ball = ++apple;
        
        //Print current values of variables
        System.out.println(apple);
        System.out.println(ball);      
       
   }//end of main
}//end of class