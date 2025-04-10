package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        question1();
        question2();

        // Question 3: Find and display the area of a circle whose radius is 7.25
        // declare variables here
        double radius = 7.25;
        double circleArea = Math.PI * radius * radius;
        // then code solution
        System.out.println("The area of the circle is " + circleArea);

        // Question 4: Find and display the square root a variable after it is set to 5.0
        // declare variable here
        double rootVariable = 5.0;
        double squareRoot = Math.sqrt(rootVariable);
        System.out.println("Square root is " + squareRoot);

        //Question 5: Find and display the distance between the points (5, 10) and (85, 50)
        //declare variables
        int point1x = 5,  point1y = 10;
        int point2x = 85, point2y = 50;
        int pointX = point2x - point1x;
        int pointY = point2y - point1y;

        double distance = Math.sqrt((pointX * pointX) + (pointY * pointY));
        System.out.println("Distance between the points " + distance);

        //Question 6: Find and display the absolute (positive) value of a variable after it is set to -3.8
        double number = -3.8;
        double absoluteValue = Math.abs(number);
        System.out.println("Absolute value of a variable -3.8 is" + absoluteValue);

        //Question 7 Find and display a random number between 0 and 1
        double random = Math.random();
        System.out.println("Random number between 0 and 1" + random);

    }

    public static void question1(){
        //Question 1 Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")
        //Variables
        double bobSalary = 50000;
        double garySalary = 60000.99;
        //Code solution highest salary
        double highestSalary = Math.max(garySalary, bobSalary);
        //Print out result
        System.out.println("Highest salary is: " + highestSalary);
    }

    public static void question2(){
        //Question 2: Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.
        //Variables
        double carPrice = 55000;
        double truckPrice = 38000;
        //Code solution Cheapest car price
        double cheapestCarPrice = Math.min(carPrice, truckPrice);
        //Print out result
        System.out.println("Cheapest car is: " + cheapestCarPrice);

    }

}







