import java.util.Scanner;

class MultiplicationTableFor {
     public static void main(String[] args) {
         Scanner input  = new Scanner(System.in);
         System.out.println("Welcome to Multiplication Table Printing");
         System.out.print("Please enter the number you want to print: ");
         int num = input.nextInt();

         for(int i =1;i<=10;i++){
             System.out.println(num +" X "+ i +"=" + (num*i));
         }
     }
}
