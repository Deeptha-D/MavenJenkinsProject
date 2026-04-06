package com.example;

public class App {

    public double calculateBill(int units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.20;
        } else if (units <= 300) {
            bill = (100 * 1.20) + (units - 100) * 2.00;
        } else {
            bill = (100 * 1.20) + (200 * 2.00) + (units - 300) * 3.00;
        }

        return bill;
    }
}
