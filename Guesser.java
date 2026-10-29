import java.util.*;
import java.lang.*;
import java.io.*;

public class Guesser{
  
  public int menu() {
    int userChoice;
    Scanner sc = new Scanner(System.in);
    System.out.println("0) Quit");
    System.out.println("1) Human Guesser");
    System.out.println("2) Computer Guesser");
    System.out.println("");
    System.out.print("Please choose 0-2: ");
    userChoice = sc.nextInt();
    
    return userChoice;
  }// end menu

  public void mainLoop() {
    boolean keepGoing = true;
    int response;
    while (keepGoing) {
      response = menu();
      if (response == 0){
        System.out.println("You chose Quit");
        keepGoing = false;
      }
      else if (response == 1){
        System.out.println("You chose Human Guesser");
      }
      else if (response == 2){
        System.out.println("You chose Computer Guesser");
      }
      else{
        System.out.println("You can only input numbers between 0-2. Please Try Again.");
      }// end if
    }// end while
  }// end mainLoop
  
  public static void main (String[] args){
    Guesser guess = new Guesser();
    guess.mainLoop();
  }//end main
}// end Guesser
