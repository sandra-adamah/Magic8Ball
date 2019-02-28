package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare

        Scanner keyboard;
        keyboard = new Scanner(System.in);


       int aNumber;

        //initialization phase

        System.out.println("Ask a yes or no/true or false question");
        keyboard.nextLine();


        System.out.println("Choose a number 1-100");
        aNumber = keyboard.nextInt();


            if ((aNumber >= 0) && (aNumber <= 10)) {
                System.out.println("Of course!");
            }
            else if ((aNumber>= 11) && (aNumber <= 20)) {
                System.out.println("Absolutely");
            }
            else if ((aNumber>= 21) && (aNumber <= 30)) {
                System.out.println("Sure why not?!");
            }
            else if ((aNumber>= 31) && (aNumber <= 40)) {
                System.out.println("Yes");
            }
            else if ((aNumber>= 41) && (aNumber <= 50)) {
                System.out.println("Yes yes yes yes, couldn't have thought of anything better!");













    }
}
