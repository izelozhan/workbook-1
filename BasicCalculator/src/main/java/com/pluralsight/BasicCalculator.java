package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = myScanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = myScanner.nextDouble();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String option = myScanner.next().toUpperCase();

        double result;

        if(option.equals("A")){
            result = num1 + num2;
            System.out.println("Your result is " + result);
        } else if (option.equals("S")){
            if(num1 > num2){
                result = num1 - num2;
            } else {
                result = num2 - num1;
            }
            System.out.println("Your result is " + result);
        } else if (option.equals("M")){
            result = num1 * num2;
            System.out.println("Your result is " + result);

        } else if (option.equals("D")){
            result = num1 / num2;
            System.out.println("Your result is " + result);

        } else {
            System.out.println("You need to choose one of the options below");
        }


    }
}
