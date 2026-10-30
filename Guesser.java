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
    Guesser guess = new Guesser();
    while (keepGoing) {
      response = menu();
      if (response == 0){
        keepGoing = false;
      }
      else if (response == 1){
        guess.humanGuesser();
      }
      else if (response == 2){
        System.out.println("You chose Computer Guesser");
      }
      else{
        System.out.println("You can only input numbers between 0-2. Please Try Again.");
      }// end if
    }// end while
  }// end mainLoop
  
  void humanGuesser(){
    int random, userGuess, count;
    boolean keepGoing = true;
    random = (int)(Math.random() * 100)+1;
    count = 0;
    System.out.println(random);
    Scanner sc = new Scanner(System.in);
    while (keepGoing){
      count += 1;
      System.out.print("Choose a number between 1 and 100: ");
      userGuess = sc.nextInt();
      System.out.println("");
      if (userGuess > random){
        System.out.println("Too High...");
      }
      else if (userGuess < random){
        System.out.println("Too Low...");
      }
      else if (userGuess == random){
        System.out.printf("Congrats! You got the number in %,d attempts. %n", count);
        keepGoing = false;
      }
      else{
        System.out.println("Error: Please Choose a Number Between 1-100.");
      }// end if
    }// end while
  }// end humanGuesser

  void computerGuesser(){
    int count, computerGuess, binarySearch;
    String userResponse;
    boolean keepGoing = true;
    count = 0;
    computerGuess = 50;
    Scanner sc = new Scanner(System.in);
    while (keepGoing){
      binarySearch = computerGuess / 2;
      count += 1;
      System.out.printf("%,d) I guess %,d. %n", count, computerGuess);
      System.out.print("Too (H)igh, Too (L)ow, or (C)orrect? ");
      userResponse = sc.next();

    }//end while
  }// end computerGuesser

  public static void main (String[] args){
    Guesser guess = new Guesser();
    guess.mainLoop();
  }//end main
}// end Guesser
