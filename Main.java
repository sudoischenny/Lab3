//Import Scanner Class
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws InterruptedException {
    int intZero = 0;
    Scanner myInput = new Scanner (System.in);
    System.out.println("Enter a number to count down or up from:");
    int intCount = myInput.nextInt();

//Check nested if statements to check if > 0 or < 0
    if (intCount > 0) {
      for(System.out.println("Counting Down:"), intZero = -1; intZero != intCount; intCount--) {
        System.out.println(intCount);
        Thread.sleep(1000);
      }
      System.out.println("Blast Off!");
    }
    // where value is less than 0
    else {
      for(System.out.println("Counting Up:"), intZero = 1; intZero != intCount; intCount++) {
        System.out.println(intCount);
        Thread.sleep(1000);
      }
      System.out.println("Blast Off!");
    }
  }
}