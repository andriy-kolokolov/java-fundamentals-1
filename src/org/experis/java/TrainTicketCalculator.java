package org.experis.java;

import java.util.Scanner;

public class TrainTicketCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance: ");
        int userKm = scanner.nextInt();

        System.out.println("Enter age: ");
        int userAge = scanner.nextInt();

        System.out.println("Your ticket price is: €" +
                String.format("%.2f", getTrainTicketPrice(userKm, userAge)));

        scanner.close();
    }

    public static double getTrainTicketPrice(int km, int age) {
        final double KM_PRICE = 0.21;
        final double JUNIOR_DISCOUNT = 0.20;
        final double SENIOR_DISCOUNT = 0.4;
        final int JUNIOR_AGE = 18;
        final int SENIOR_AGE = 65;

        double defaultPrice = KM_PRICE * km;

        if (age < JUNIOR_AGE) {
            return defaultPrice - (defaultPrice * JUNIOR_DISCOUNT);
        }
        if (age >= SENIOR_AGE) {
            return defaultPrice - (defaultPrice * SENIOR_DISCOUNT);
        } else {
            return defaultPrice;
        }
    }
}
