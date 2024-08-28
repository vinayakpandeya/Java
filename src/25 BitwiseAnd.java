import java.util.Scanner;

class BitwiseAnd {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Bitwise And Operator\n");
         System.out.print("Please enter your first  number: ");
         int first = input.nextInt();
         System.out.print("Now,enter your second number ");
         int second = input.nextInt();

         int result = first & second;
         System.out.println("Result is: "  + result);


     }
}
