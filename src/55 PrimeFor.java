import java.util.Scanner;

class PrimeFor {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Prime number Checker\n");
         System.out.print("Please enter your number:" );
         int num = input.nextInt();
         System.out.println("Your Number is " + (isPrime(num) ? "Prime" : "NotPrime"));
     }


public static boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
}


