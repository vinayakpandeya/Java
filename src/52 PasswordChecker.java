import java.util.Scanner;

class PasswordChecker {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Password Checker\n");
         String password;
         do {
             System.out.print("Please enter your password: ");
             password = input.next();
         } while(!isValidPassword(password));
         System.out.println("Thanks for entering a Valid Password");
     }


     public static boolean isValidPassword(String password){
         return password.length()>6;

     }
}
