import java.util.Scanner;

class BitwiseCompliment {
  public static void main(String[] args) {
   Scanner input =new Scanner(System.in);
   System.out.println("Welcome to Bitwise Compliment Operator\n");
   System.out.print("Please enter the  number:");
   int num = input.nextInt();

   int result = ~num;
   System.out.println("Result is:" + result);

  }
}
