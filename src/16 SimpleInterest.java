import java.util.Scanner;

 class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator\n");
        System.out.print("Please enter your Principal Amount RS: ");
        int principle = input.nextInt();
        System.out.print("Now,Tell me your rate of Interest: ");
        int rate = input.nextInt();
        System.out.println("Now,Tell me how many years are you borrowed: ");
        float years = input.nextInt();

        float interest   = (principle * rate * years/ 100) ;
        System.out.println("\n\nSimple interest is Rs: " + interest );

    }
}
