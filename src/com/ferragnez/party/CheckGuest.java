package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        for (int i = 0; i < guests.length; i++){
            System.out.println(guests[i]);
        }
        Scanner input = new Scanner(System.in);
        String guestName = input.nextLine();
        input.close();

        boolean isInTheList = false;
        int index = 0;

        while (!isInTheList && index < guests.length) {
            if (guests[index].equalsIgnoreCase(guestName)){
                isInTheList = true;
            } else {
                index++;
            }
        }

        if (isInTheList) {
            System.out.println("Guest Found");
        } else {
           System.out.println("Guest NOT Found"); 
        }

    }
}
