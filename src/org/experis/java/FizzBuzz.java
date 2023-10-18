package org.experis.java;

public class FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz(100);
    }

    public static void printFizzBuzz(int count) {
        for (int i = 0; i < count; i++) {
            if (i == 0) continue; // skip printing '0' when i == 0,1 or 2
            if (i % 3 == 0) System.out.printf("%d Fizz. %d is multiple of 3\n", i, i);
            if (i % 5 == 0) System.out.printf("%d Buzz. %d is multiple of 5\n", i, i);

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.printf("%d FizzBuzz. %d is multiple of 3 and 5 \n", i, i);
            } else {
                System.out.println(i);
            }
        }
    }
}
