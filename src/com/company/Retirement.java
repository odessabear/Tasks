package com.company;

import java.util.Scanner;

/**
 * Created by alexander.mikhailov on 09.11.2016.
 */
public class Retirement {
    public static void main (String[] args) {
        // read input data
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        //obnovit ostatok na schetu, poka ne dostignuta neobhodimaya summa

        while (balance < goal)
        //dobavit' ezhegodniy vznos i procenti
        {
            balance += payment;
            double interest = balance*interestRate/100 ;
            balance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + "years.");
    }
}
