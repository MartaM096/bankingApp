package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our bank!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.next();
        System.out.println("Please enter your surname ");
        String surname = sc.next();
        int select;


        Account user = new Account(name, surname);

        do {
            System.out.println("1. User details\n 2. Deposit money\n 3.Withdraw money\n 4.Exit program");
            select = sc.nextInt();
            switch (select) {

                case 1:
                    System.out.println("User details");
                    System.out.println(user.details());
                    break;
                case 2:
                    System.out.println("Deposit money");
                    System.out.println("How much money do you want to deposit?");
                    int deposit = sc.nextInt();
                    user.deposit(deposit);
                    System.out.println("Your current balance is" + user.getBalance());
                    break;
                case 3:
                    System.out.println("Withdraw money");
                    System.out.println("How much money do you want to withdraw?");
                    int withdraw = sc.nextInt();
                    if (user.getBalance() > withdraw) {
                        user.withdraw(withdraw);
                        System.out.println("Your current balance is " + user.getBalance());
                    } else {
                        System.out.println("We can't do this operation because your account balance is under withdraw value");
                    }
                    break;
                case 4:
                    System.out.println("Exit program");

            }
        }
        while (select!=4);
    }
}