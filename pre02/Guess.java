import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args) {
    int user;
    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

    // prompt the user and get the value
    System.out.println("Type a number: ");
    user = in.nextInt();
    System.out.println("Your guess is:" + user);
    
    //pick a random number
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.println("The number I was thinking of is: " + number);

    //calculate difference btwn. user number input and random number selected
    System.out.println("You were off by: " + user-number);


  }
}