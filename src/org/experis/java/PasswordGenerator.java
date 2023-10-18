package org.experis.java;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert name");
        String name = scanner.nextLine();
        System.out.println("Insert lastname");
        String lastname = scanner.nextLine();
        System.out.println("Insert color");
        String color = scanner.nextLine();
        System.out.println("Insert date birth");
        String dateBirth = scanner.nextLine();

        scanner.close();

        System.out.println("Your secure password is: " + getPassword(name, lastname, color, dateBirth));
    }

    public static String getPassword(
            String name,
            String lastname,
            String color,
            String dateBirth
    ) {
        // split and sum date nums
        int dateSum = 0;
        String[] dateSplit = dateBirth.split("/");
        int[] numbers = new int[dateSplit.length];
        for (int i = 0; i < dateSplit.length; i++) {
            numbers[i] = Integer.parseInt(dateSplit[i]);
        }
        for (int number : numbers) {
            dateSum += number;
        }

        return String.format("%s-%s-%s-%s", name, lastname, color, dateSum);
    }
}
