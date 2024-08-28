import java.util.Scanner;

 class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator");
        System.out.print("Please enter the base in cm: ");
        double base = input.nextDouble();
        System.out.print("Now,enter the perpendicular in cms: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of the Triangle: " + area + "cm");


    }
}
