import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise OR Operator\n");
        System.out.print("Please enter the first number:");
        int first = input.nextInt();
        System.out.print("Please enter the second number:");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Result is: " + result );

    }
}
