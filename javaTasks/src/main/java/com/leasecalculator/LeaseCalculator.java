package com.leasecalculator;

import java.util.Scanner;

public class LeaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the total leased money: ");
        double totalLeasedMoney = scanner.nextDouble();

        System.out.print("Enter the down payment: ");
        double downPayment = scanner.nextDouble();

        System.out.print("Enter the lease term in months: ");
        int monthsLeaseTerm = scanner.nextInt();

        System.out.print("Enter the interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();

        // Calculating the monthly payment
        double monthlyPayment = calculateMonthlyPayment(totalLeasedMoney, downPayment, monthsLeaseTerm, interestRate);

        // Displaying the result
        System.out.printf("The monthly lease payment is: %.2f\n", monthlyPayment);

    }

    // Method to calculate the monthly payment based on the formula
    public static double calculateMonthlyPayment(double totalLeasedMoney, double downPayment, int monthsLeaseTerm, double interestRate) {
        double principalAmount = totalLeasedMoney - downPayment;
        double totalWithInterest = principalAmount + (principalAmount * (interestRate / 100));
        return totalWithInterest / monthsLeaseTerm;
    }
}