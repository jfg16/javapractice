/************************************************************************************************
 * File Name:   SlackerRadio.java
 * 
 * Due Date:    04/06/18
 * 
 * Author:      Jonathan Garcia
 * 
 * Program Description:  This program will allow user to play a music station, create their own or exit the application
 * 
 * Input:       lname (Last Name), artist station number & menuchoice
 *
 * Output:      menuchoice, lname, artist & rstation             
 *
 * Processing:  Make the Last Name upper case, read menu choice to take to correct station, and read the artist station number chosen to give them the name of artist it will play              
 *              
 * **********************************************************************************************/

import java.util.Scanner; //needed to use Scanner for input

public class SlackerRadio {
  public static void main(String[ ] args) {
   
        //Declare variables
        int menuchoice, artistnum;
        String lname = "", rstation = "", artist = "";
     
        //Create a Scanner object
        Scanner sta = new Scanner(System.in);
    
        //Display the Opening Statement which includes the Slacker Radio Menu
        System.out.println("\n******************************************************************************");
        System.out.println("\n                          Welcome to Slacker Radio                            ");
        System.out.println("                                                                              ");
        System.out.println("                          Slacker Radio Menu:                                 ");
        System.out.println("                          1 - Create a New Slacker Radio Station              ");
        System.out.println("                          2 - Play a Slacker Radio Station                    ");
        System.out.println("                          3 - Exit Slacker Radio                              ");
        System.out.println("                                                                              ");
        System.out.println("******************************************************************************");
        System.out.println();
  
        //Prompt the user for their last name and menu choice option
        System.out.print("Please enter your last name followed by your Slacker Radio Menu Choice: ");
 
        //Read the user's lastname and read the user's menu choice; Parse string if necessary!
        //Convert last name to uppercase, if necessary
        lname = sta.next().toUpperCase();
        menuchoice = sta.nextInt();
        System.out.println("");

        //Use a control statement such as an (if()/else if() or switch()) to process the user's menu choice 
        //(options:  1, 2, 3, other)
        switch(menuchoice) {
                case 1: 
                    System.out.println("You have selected CREATE A NEW Slacker Radio Station menu option.");
                    System.out.println("");
                    System.out.print("Please enter the name of the new station: ");
                    
                    rstation = sta.next().toUpperCase();
                    
                    System.out.println("");
                    System.out.println("You have successfully created the following station: " + rstation);
                    break;
                    
                case 2:
                    System.out.println("You have selected to play a Slacker Radio Station menu option.");
                    System.out.println("");
                    System.out.println("The user " + lname + " currently has created the following stations:");
                    System.out.println("");
                    
                    System.out.println("1. Linkin Park");
                    System.out.println("2. Florence + the Machine");
                    System.out.println("3. Beyonce");
                    System.out.println("4. Hamilton Musical Soundtrack");
                    System.out.println("5. Rainbow Kitten Surprise");
                    System.out.println("6. Camilla Cabello");
                    System.out.println("7. Mozart");
                    System.out.println("8. Machine Gun Kelly");
                    System.out.println("9. Blake Shelton");
                    System.out.println("10. Chance the Rapper");
                    
                    System.out.println("");
                    System.out.print("Which station would you like to listen to? (Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, or 10): ");
                    artistnum = sta.nextInt();
                      if(artistnum == 1) {
                        artist = "LINKIN PARK";
                      }
                      else if(artistnum == 2) {
                        artist = "FLORENCE + THE MACHINE";
                      }
                      else if(artistnum == 3) {
                        artist = "BEYONCE";
                      }
                      else if(artistnum == 4) {
                        artist = "HAMILTON";
                      }
                      else if(artistnum == 5) {
                        artist = "RAINBOW KITTEN SURPRISE";
                      }
                      else if(artistnum == 6) {
                        artist = "CAMILLA CABELLO";
                      }
                      else if(artistnum == 7) {
                        artist = "MOZART";
                      }
                      else if(artistnum == 8) {
                        artist = "MACHINE GUN KELLY";
                      }
                      else if(artistnum == 9) {
                        artist = "BLAKE SHELTON";
                      }
                      else if(artistnum == 10) {
                        artist = "CHANCE THE RAPPER";
                      }
                      else if(10 < artistnum) {
                        artist = "DAILY MIX";
                      }
                    
                    System.out.println("");
                    System.out.println("You are now listening to " + artist + "!");
                    break;
                    
                case 3: 
                    System.out.println("You have selected the EXIT Slacker Radio menu station.");
                    break;
                default:
                    System.out.println("You have selected the EXIT Slacker Radio menu station.");
                    break;
        }//end of switch
  
        //Display Thank you message
        System.out.println("");
        System.out.println(lname + "!   Thank you for being a valued listener!");
        System.out.println("");
        System.out.println("\n************************Goodbye Slacker Radio Listener**********************");

  }//end of main
}//end of class