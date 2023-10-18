package org.experis.java;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        int passLength = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Insert your secure password length: ");
                passLength = scanner.nextInt();
                break; // exit loop if a valid integer is provided
            } catch (InputMismatchException e) {
                System.err.println("\nInvalid input. Please enter a valid integer:");
                scanner.nextLine();
            }
        }
        scanner.close();

        System.out.println("Your secure password is: " + getSecurePassword(passLength));
    }

    public static String getSecurePassword(int len) {

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        long currentTimeMillis = System.currentTimeMillis();
        String chars = "0123456789!@#$%^&*()-_+=<>?";
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String upperChars = lowerChars.toUpperCase();

        String allChars = chars + lowerChars + upperChars + currentTimeMillis;

        for (int i = 0; i < len; i++) {
            // get random index in max length chars range
            int randomIndex = random.nextInt(allChars.length());
            // append random selected char
            password.append(allChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
