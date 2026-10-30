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
      try {
        response = menu();
        if (response == 0){
          keepGoing = false;
        }
        else if (response == 1){
          guess.humanGuesser();
        }
        else if (response == 2){
          guess.computerGuesser();
        }
        else{
          System.out.println("You can only input numbers between 0-2. Please Try Again.");
        }// end if
      }// end try
      catch (InputMismatchException e) {
        System.out.println("You can only input integers. Please Try Again.");
      }//end catch
    }// end while
  }// end mainLoop
  
  void humanGuesser(){
    int random, userGuess, count;
    boolean keepGoing = true;
    random = (int)(Math.random() * 100)+1;
    count = 0;
    Scanner sc = new Scanner(System.in);
    while (keepGoing){
      try {
        count += 1;
        System.out.print("Choose a number between 1 and 100: ");
        userGuess = sc.nextInt();
        System.out.println("");
        if (userGuess <= 0){
          System.out.println("Error: Please Choose a Number Between 1-100.");
          count -= 1;
        }
        else if (userGuess > 100){
          System.out.println("Error: Please Choose a Number Between 1-100.");
          count -= 1;
        }
        else if (userGuess > random){
          System.out.println("Guess Too High...");
        }
        else if (userGuess < random){
          System.out.println("Guess Too Low...");
        }
        else if (userGuess == random){
          System.out.printf("Congrats! You got the number in %,d attempts. %n", count);
          keepGoing = false;
        }
        else{
          System.out.println("Error: Please Choose a Number Between 1-100.");
          count -= 1;
        }// end if
      }// end try
      catch (InputMismatchException e) {
        System.out.println("Error: Please only enter integers.");
        count -= 1;
        sc.next();
      }// end catch
    }// end while
  }// end humanGuesser

  void computerGuesser(){
    int count, lowLimit, upLimit, guess;
    String userResponse;
    boolean keepGoing = true;
    count = 0;
    lowLimit = 1;
    upLimit = 100;
    Scanner sc = new Scanner(System.in);
    while (keepGoing){
      count += 1;
      guess = lowLimit + (upLimit - lowLimit) / 2;
      System.out.printf("%,d) I guess %,d. %n", count, guess);
      System.out.print("Too (h)igh, Too (l)ow, or (c)orrect? ");
      userResponse = sc.next();
      System.out.println("");
      if (userResponse.equals("h")){
        upLimit = guess - 1;
      }
      else if (userResponse.equals("H")){
        upLimit = guess - 1;
      }
      else if (userResponse.equals("L")){
        lowLimit = guess + 1;
      }
      else if (userResponse.equals("l")){
        lowLimit = guess + 1;
      }
      else if (userResponse.equals("C")){
        System.out.printf("Number correctly guessed in %,d attempts. %n", count);
        keepGoing = false;
      }
      else if (userResponse.equals("c")){
        System.out.printf("Number correctly guessed in %,d attempts. %n", count);
        keepGoing = false;
      }
      else{
        System.out.println("Error: Please enter only h, l, or c.");
        count -= 1;
      }// end if
    }//end while
  }// end computerGuesser

  public static void main (String[] args){
    Guesser guess = new Guesser();
    guess.mainLoop();
  }//end main
}// end Guesser
