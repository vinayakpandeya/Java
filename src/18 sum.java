import java.util.Scanner;

 class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator:");
        System.out.print("Please enter the first number");
        int firstNum = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your number is:" + sum);
    }
}