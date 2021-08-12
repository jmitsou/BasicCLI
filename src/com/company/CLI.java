package com.company;

import java.util.Scanner;

public class CLI {

    public void menuSelection() {
        Scanner scanner = new Scanner(System.in);
        Scanner userConvo = new Scanner(System.in);
        System.out.println("Please choose an option to continue:");
        System.out.println("(1) Say Hello,(2) Reverse a string,(3) Add two numbers,(4) Exit Program");
        System.out.println("Please enter a number value.");

        int enteredValue = scanner.nextInt();

        if (enteredValue == 1) {
            System.out.println("What is your name: ");

            String userName = userConvo.nextLine();
            System.out.println("Hello " + userName);
            menuSelection();
        } else if (enteredValue == 2) {
            String entStr = userConvo.nextLine();


            menuSelection();
        } else if (enteredValue == 3) {
            System.out.println("Enter value 1: ");
            int val1 = userConvo.nextInt();
            System.out.println("Enter value 2: ");
            int val2 = userConvo.nextInt();
            int sum = val1 + val2;
            System.out.println("Total value is " + sum);
            menuSelection();
        } else if (enteredValue == 4) {
            System.out.println("Bye have a nice day");
        }

    }
}
