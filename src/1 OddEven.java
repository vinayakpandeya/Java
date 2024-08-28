import java.util.Scanner;

 class OddEven {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Number Checker\n ");
   System.out.print("Please enter your number: ");
   int num = input.nextInt();

   if(num % 2==0) {
    System.out.println("Your Number is Even");
   } else{
    System.out.println("Your Number is Odd");
   }
  }
}
