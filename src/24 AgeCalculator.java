import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Calculator\n");
        System.out.print("Please enter your age");
        int age = input.nextInt();

        if(age>=65) {
            System.out.println("You are Senior Citizen");
        } else if(age>=20){
            System.out.println("You are Adult");
        } else if (age>=13) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are Child");
        }

    }
}
