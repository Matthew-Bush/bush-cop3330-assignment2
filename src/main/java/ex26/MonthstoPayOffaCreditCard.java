/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Bush
 */
package ex26;

import java.util.Scanner;

public class MonthstoPayOffaCreditCard {
    public static int payoff(double balance, double apr, double payment) {

        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double balance, apr, payment;

        System.out.print("Enter your balance: ");
        balance = scanner.nextDouble();

        System.out.print("Enter your APR percent: ");
        apr = scanner.nextDouble();
        apr = apr / 100;

        System.out.print("Enter your monthly payment: ");
        payment = scanner.nextDouble();

        int months = payoff(balance, apr, payment);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
}
