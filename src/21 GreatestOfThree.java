import java.util.Scanner;

class GreatestOfThree {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to The World of Three\n");
         System.out.print("Please enter your First Number: ");
         int first = input.nextInt();
         System.out.print("Now,enter your Second Number: ");
         int second = input.nextInt();
         System.out.print("Finally,enter your Third Number: ");
         int third = input.nextInt();

         if(first>=second && first>=third ) {
             System.out.println(first + "Is the Greatest Number");
         } else if(second>=third) {
             System.out.println(second + "Is the Greatest Number");
         }else{
             System.out.println(third +" Is the Greatest Number");
             }
         }
     }

