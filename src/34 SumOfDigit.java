import java.util.Scanner;

class SumOfDigit {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Sum Of Digit");
   System.out.print("Please enter your number: ");
   int num = input.nextInt();
   int sum = SumOfDigits(num);
   System.out.println("Sum Of Digits is: " + sum);
  }

   public static int SumOfDigits(int num){
    int sum = 0;
    while(num>0){
     sum = sum + (num%10);
     num /= 10;
    }
    return sum;


   }


  }

