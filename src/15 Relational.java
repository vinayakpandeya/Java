import java.util.Scanner;

 class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving License\n");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Your are eligible for Driving");
        } else {
            System.out.println("Beta Cycle Challah ");
        }
    }
}

