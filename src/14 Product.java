import java.util.Scanner;

 class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Product of Number");
        System.out.print("Please enter the first number: ");
        double first = input.nextInt();
        System.out.print("Now, enter the second number: ");
        double second = input.nextInt();
        double mul = first *  second;
        System.out.println("Multiplication of your number is: " + mul);


    }
}
