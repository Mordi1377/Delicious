package com.pluralsight;
import java.util.Scanner;

public class DrinkScreen {
    private Scanner scanner;
    private Order order;

    public DrinkScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("Select drink size (Small, Medium, Large):");
        String size = scanner.nextLine();

        System.out.println("Select drink flavor (coca, dr. pepper, fanta):");
        String flavor = scanner.nextLine();

        Drink drink = new Drink();

        order.addItem(drink);
        System.out.println("Drink added to the order.");
    }
}
