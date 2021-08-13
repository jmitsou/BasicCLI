package com.company;

import java.util.Objects;
import java.util.Scanner;

public class CLI {

    public void menuSelection() {
        Scanner userConvo = new Scanner(System.in);
        System.out.println("\nPlease choose an option to continue:");
        System.out.println("(1) Say Hello \n(2) Reverse a string \n(3) Add two numbers \n(4) Exit Program");
        System.out.print("Selection: ");
        int enteredValue = userConvo.nextInt();

        if (enteredValue == 1) {
            System.out.print("What is your name: ");
            userConvo.nextLine();
            String userName = userConvo.nextLine();
            System.out.println("Hello " + userName);

            proceed();
        } else if (enteredValue == 2) {

            StringBuilder str = new StringBuilder();
            System.out.println("Please enter a string to reverse: ");
            userConvo.nextLine();
            String entStr = userConvo.nextLine();
            str.append(entStr);
            str.reverse();
            System.out.println(str);
            proceed();

        } else if (enteredValue == 3) {

            System.out.println("Enter value 1: ");
            int val1 = userConvo.nextInt();
            System.out.println("Enter value 2: ");
            int val2 = userConvo.nextInt();
            int sum = val1 + val2;
            System.out.println("Total value is " + sum);

            proceed();

        } else if (enteredValue == 4) {
            System.out.println("Bye have a nice day");
        }
    }

    public void proceed() {
        Scanner pro = new Scanner(System.in);
        System.out.println("Would you like to choose another option? (1) Yes or (2) No");
        int choice = pro.nextInt();

        if (choice == 1) {
            menuSelection();
        } else {
            System.out.println("Bye have a nice day");
        }
    }
}
