import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator\n");
        System.out.println("PLease enter the All four side in cms: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a+b+c+d;
        System.out.println("Perimeter of your rectangle is :" + perimeter + "cm");
    }
}
