import java.util.Scanner;

class LeapYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Leap Year Calculator\n");
         System.out.print("Please enter your year that you want to check: ");
         int year = input.nextInt();

         if(year % 4 == 0 || year % 400 == 0 && year % 100 !=0) {
             System.out.println("Your Year is Leap Year");
         }
         else {
             System.out.println("Your Year Is not Leap Year");
         }
         }

     }

