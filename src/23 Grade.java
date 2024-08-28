import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator\n");
        System.out.print("Please enter your Percentage: ");
        float percentage = input.nextFloat();

        if(percentage >= 90) {
            System.out.println("Great,You have Got A");
        }else if (percentage >= 75) {
            System.out.println("Good,You have Got B");
        }else if(percentage >= 60) {
            System.out.println("You have Got C , Work harder next time");
        }else if(percentage >=30) {
            System.out.println("You have Got D, Seriously Need to Work harder");
        }else {
            System.out.println("You hav Got F, You are Fail");
        }



        }
    }

