package com.pluralsight;
import java.util.Scanner;

public class ChipsScreen {
    private Scanner scanner;
    private Order order;

    public ChipsScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("\nSelect chips type:");
        System.out.println("1) French Fries");
        System.out.println("2) Sweet Potato Fries");
        System.out.println("3) BBQ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String chipsChoice;
        switch (choice) {
            case 1:
                chipsChoice = "French Fries";
                break;
            case 2:
                chipsChoice = "Sweet Potato Fries";
                break;
            case 3:
                chipsChoice = "BBQ";
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return;
        }

        Chips chips = new Chips(chipsChoice);
        order.addItem(chips);
        System.out.println(chipsChoice + " added to the order.");
    }
}

