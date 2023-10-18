package org.experis.java;

import java.util.Scanner;

public class FerragnezFest {

    public static void main(String[] args) {

        String[] celebrities = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Per controllare se sei invitato alla festa inserisci il tuo nome:");
        String userName = sc.nextLine();

        // validate username using for loop + while loop
        if (isAllowedFORLOOP(userName, celebrities) && isAllowedWHILELOOP(userName, celebrities)) {
            System.out.println("Ciao, " + userName + " benvenuto alla festa!");
        } else {
            System.out.println("Purtroppo nome " + userName + " non trovato nella lista degli invitati.");
        }
    }

    public static boolean isAllowedWHILELOOP(String userName, String[] celebrities) {
        int i = 0;
        while (i != celebrities.length) {
            if (celebrities[i].equalsIgnoreCase(userName)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean isAllowedFORLOOP(String userName, String[] celebrities) {
        for (String celebrity : celebrities) {
            if (celebrity.equalsIgnoreCase(userName)) {
                return true;
            }
        }
        return false;
    }

}
