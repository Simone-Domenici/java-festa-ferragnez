package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        for (int i = 0; i < guests.length; i++){
            System.out.println(guests[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String guestName = input.nextLine();
        input.close();

        boolean isInTheList = false;
        int index = 0;

        while (!isInTheList && index < guests.length) {
            if (guests[index].replaceAll("\\s{2,}"," ").replaceAll("\\-"," ").trim().equalsIgnoreCase(guestName.replaceAll("\\s{2,}"," ").replaceAll("\\-"," ").trim())){
                isInTheList = true;
            } else {
                index++;
            }
        }

        // ***BONUS***
        // for ( int i = 0; i < guests.length; i++){
        //     if (guests[i].replaceAll("\\s{2,}"," ").replaceAll("\\-"," ").trim().equalsIgnoreCase(guestName.replaceAll("\\s{2,}"," ").replaceAll("\\-"," ").trim())){
        //         isInTheList = true;
        //         break;
        //     }
        // }
        
        if (isInTheList) {
            System.out.println("Guest Found");
        } else {
            System.out.println("Guest NOT Found"); 
        }
    }
}
