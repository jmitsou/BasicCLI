package com.company;

import java.util.Scanner;

public class CLI {

    public void menuSelection() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose an option to continue:");
        System.out.println("(1) Say Hello,(2) Reverse a string,(3) Add two numbers,(4) Exit Program");
        System.out.println("Please enter a number value.");

        int enteredValue = scanner.nextInt();

        if (enteredValue == 1) {
            Scanner userConvo = new Scanner(System.in);
            System.out.println("What is your name: ");

            String userName = userConvo.nextLine();
            System.out.println("Hello " + userName);
            menuSelection();
        } else if (enteredValue == 2) {

            menuSelection();
        } else if (enteredValue == 3) {
            Int val1 =




            menuSelection();
        } else if (enteredValue == 4) {
            System.out.println("Bye have a nice day");
        }

    }
}
