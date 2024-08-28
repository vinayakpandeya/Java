import java.util.Scanner;

 class LeftShift {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Left Shift Operator\n");
         System.out.print("Please enter the number:");
         int num = input.nextInt();

         int result = num << 2;
         System.out.println("Result is:" + result);
     }
 }
