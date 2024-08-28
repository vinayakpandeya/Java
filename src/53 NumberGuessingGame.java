import java.util.Scanner;

class NumberGuessingGame {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num = 3 , guess;
         System.out.println("Welcome to the number guessing game\n");
         do {
             System.out.print("Please enter the number between 0 and 10:");
              guess = input.nextInt();
         } while (num != guess);
         System.out.println("You have Successfully Guess the number");
     }


}
