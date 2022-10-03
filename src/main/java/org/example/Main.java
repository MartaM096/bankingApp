package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our bank!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=sc.next();
        System.out.println("Please enter your surname ");
        String surname=sc.next();


        Account user=new Account(name, surname);

        System.out.println("1. User details\n 2. Deposit money\n 3.Withdraw money");
        int select=sc.nextInt();

        switch (select){
            case 1:
                System.out.println("User details");
                break;
            case 2:
                System.out.println("Deposit money");
                break;
            case 3:
                System.out.println("Withdraw money");
                break;
        }

    }
}