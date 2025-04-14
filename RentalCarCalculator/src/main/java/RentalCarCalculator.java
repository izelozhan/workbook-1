import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //pick up date
        //number of days for the rental
        //electronic toll tag $3.95(yes/no)
        //gps $2.95/day (yes/no)
        //roadside assistance $3.95 (yes/no)
        //current age


        //based prices
        double basicCarRental = 29.99;
        double electronicTollTagPrice = 3.95;
        double gpsPrice = 2.95;
        double roadsideAssistPrice = 3.95;
        double surcharge = 0.30;


        //users input
        int driversAge;
        int daysRental;
        String date;
        String toll;
        String gps;
        String roadsideAssist;


        //System print

        System.out.println("Welcome to the Rental Car Calculator!");
        System.out.println("How old are you?");

        driversAge = myScanner.nextInt();

        System.out.println("How many days will you rent a car?");
        daysRental = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("When will you pick up?");
        date = myScanner.nextLine();

        System.out.println("Do you want to add electronic toll at $3.95/day? (Yes/No)");
        toll = myScanner.nextLine();

        System.out.println("Do you want to add GPS at $2.95/day? (Yes/No)");
        gps = myScanner.nextLine();

        System.out.println("Do you want to add roadside assistance at $3.95/day? (Yes/No)");
        roadsideAssist = myScanner.nextLine();

        //base car rental
        double baseRentalTotal = daysRental * basicCarRental;
        double optionsCost = 0;

        //switch statements for calculate options cost
        switch (roadsideAssist.toLowerCase()){
            case "yes":
                optionsCost = optionsCost + (roadsideAssistPrice * daysRental);
                break;
            case "no":
                break;
        }

        switch (gps.toLowerCase()){
            case "yes":
                optionsCost = optionsCost + ( gpsPrice * daysRental);
                break;
            case "no":
                break;

        }

        switch (toll.toLowerCase()){
            case "yes":
                optionsCost = optionsCost + (electronicTollTagPrice * daysRental);
                break;
            case "no":
                break;

        }

        //rent with options
        double totalRental = baseRentalTotal + optionsCost;

        // Calculate => Basic Car Rental, Options Cost, Underage Driver Surcharge, Total Cost
        if (driversAge < 25){
            double surchargeEx = totalRental * surcharge;
            double total = totalRental + surchargeEx;
            String formatTotal = String.format("%.2f", total);
            System.out.println("Your base total is $" + baseRentalTotal + " and your total with options cost is $" + totalRental + " and extra surcharge for under 25 is $" + formatTotal);
        } else {
            String formatTotal = String.format("%.2f", totalRental);
            System.out.println("Your base total is $" + baseRentalTotal + " with extra options $" + totalRental + " and your total rent is $" + formatTotal);
        }
    }


}
