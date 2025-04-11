package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String nameInput = myScanner.nextLine();

        System.out.print("Enter your work hours: ");
        double workHoursInput = myScanner.nextDouble();

        System.out.print("Enter your pay rate: ");
        double payRateInput = myScanner.nextDouble();

        double grossPay;

        if (workHoursInput > 40){
            grossPay = (payRateInput * 1.5) * workHoursInput;
        } else {
            grossPay = workHoursInput * payRateInput;
        }

        System.out.println("Your name is " + nameInput + ", you are worked " + workHoursInput + " hours and your gross pay is " + grossPay + "$!");


    }
}
