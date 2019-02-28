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











    }
}
