import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What size of sandwich do you want today?");
        System.out.println("Press '1' for Regular: base price $5.45");
        System.out.println("Press '2' Large: base price $8.95");

        int sandwichType = myScanner.nextInt();

        System.out.println("How old are you?");

        int customerAge = myScanner.nextInt();

        double regPrice = 5.45;
        double largePrice = 8.95;
        double discount;
        double total;

        if (customerAge <= 17){
            if (sandwichType == 1){
                discount = regPrice * 0.1;
                total = regPrice - discount;
                String formatTotal = String.format("%.2f", total);
                System.out.println("Your total is $" + formatTotal + " with %10 discount");
            } else {
                discount = largePrice * 0.10;
                total = largePrice - discount;
                String formatTotal = String.format("%.2f", total);
                System.out.println("Your total is $" + formatTotal + " with %10 discount");
            }
        } else if (customerAge >= 65){
            if (sandwichType == 1){
                discount = regPrice * 0.20;
                total = regPrice - discount;
                String formatTotal = String.format("%.2f", total);
                System.out.println("Your total is $" + formatTotal + " with %20 discount");
            } else {
                discount = largePrice * 0.20;
                total = largePrice - discount;
                String formatTotal = String.format("%.2f", total);
                System.out.println("Your total is $" + formatTotal + " with %20 discount");
            }
        } else {
            if (sandwichType == 1){
                System.out.println("Your total is $" + regPrice);
            } else {
                System.out.println("Your total is $" + largePrice);
            }
        }




    }
}
