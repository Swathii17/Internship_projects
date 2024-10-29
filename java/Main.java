import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    // 0 For Rock
    // 1 For Paper
    // 2 For Scissor

    System.out.println("Enter 0 for Rock , Enter 1 for Paper and 2 for Scissor");

    Scanner sc = new Scanner(System.in);
    // taking input from user
    int input = sc.nextInt();
    // generating random logic
    Random r = new Random();
    int generated = r.nextInt(3);

    // game logic
    if (input == generated) {
      System.out.println("Draw !!");
    } else if (input == 0 && generated == 2 || input == 1 && generated == 0 || input == 2 && generated == 1) {
      System.out.println("You won the match !!! ");
    } else {
      System.out.println("Sorry !! Computer won the match , you can try again!!");
    }

    // game output
    if (generated == 0) {
      System.out.println("Computer chose Rock");
    } else if (generated == 1) {
      System.out.println("Computer chose Paper");
    } else if (generated == 2) {
      System.out.println("Computer chose Scissor");
    }
  }
}

