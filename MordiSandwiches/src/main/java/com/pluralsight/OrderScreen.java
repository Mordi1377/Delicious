package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {
    private Scanner scanner;
    private Order order;

    public OrderScreen(Scanner scanner) {
        this.scanner = scanner;
        this.order = new Order();
    }

    public void display() {
        boolean ordering = true;

        System.out.println("\n=================================");
        System.out.println("            Order Menu           ");
        System.out.println("=================================");

        while (ordering) {
            System.out.println("\nPlease select an option:");
            System.out.println(" 1) Add Sandwich");
            System.out.println(" 2) Add Drink");
            System.out.println(" 3) Add Chips");
            System.out.println(" 4) Checkout");
            System.out.println(" X) Cancel Order");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                    SandwichScreen sandwichScreen = new SandwichScreen(scanner, order);
                    sandwichScreen.display();
                    break;
                case "2":
                    DrinkScreen drinkScreen = new DrinkScreen(scanner, order);
                    drinkScreen.display();
                    break;
                case "3":
                    System.out.println("\nChips added to order.");
                    break;
                case "4":
                    System.out.println("\nChecking out...");
                    ordering = false;
                    break;
                case "X":
                    System.out.println("\nOrder canceled.");
                    ordering = false;
                    break;
                default:
                    System.out.println("\nInvalid option, please try again.");
            }
        }
        System.out.println("\n=================================");
        System.out.println("       Thank you for your order! ");
        System.out.println("=================================\n");
    }
}
