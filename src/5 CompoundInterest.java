import java.util.Scanner;

 class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator\n");
        System.out.print("Please enter your Principle Amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Now,Tell me your rate of interest: ");
        int rate = input.nextInt();
        System.out.print("Now,Tell me how many years are you borrowed: ");
        float years = input.nextInt();

        double compInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your Compound Interest is Rs:" + compInt);

}
}
