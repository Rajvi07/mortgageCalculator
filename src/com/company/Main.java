package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

//My code
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double annualIntRate = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Period(Years): ");
        double period = scanner2.nextDouble();

        double rate = annualIntRate / 12;
        double intRate = rate / 100;
        double calc = 1 + intRate;
        double periodInMonths = period * 12;
        double parenthesis = Math.pow(calc, periodInMonths);
        double numerator = principal * intRate * parenthesis;
        double denominator = parenthesis - 1;
        double result = numerator / denominator;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String finalResult = currency.format(result);
        System.out.print("Mortgage: " + finalResult);

    }
}

//Better Code
/* public class Main {

    public static void main( String[] args ) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
} */


    