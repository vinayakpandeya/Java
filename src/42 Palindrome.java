import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number Checker\n");
        System.out.print("Please enter your number:");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your Number is Palindrome");
        } else {
            System.out.println("Your Number is not Palindrome");
        }
    }

    public static boolean isPalindrome(int num) {
        int reverse = reverse(num);
        return num == reverse;
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}




