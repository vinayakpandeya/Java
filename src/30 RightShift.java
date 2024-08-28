import java.util.Scanner;

 class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Right Shift Operator\n");
        System.out.print("Please enter the number:");
        int num = input.nextInt();

        int result = num>>4;
        System.out.println("Result is:" + result);
    }
}
