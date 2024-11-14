package com.pluralsight;

import java.util.Scanner;

public class CheckoutScreen {
    private Checkout checkout;
    private Receipt receipt;
    private Scanner scanner;

    public CheckoutScreen(Order order, Scanner scanner) {
        this.checkout = new Checkout(order);
        this.receipt = new Receipt(order);
        this.scanner = scanner;
    }

    public void displayCheckout() {
        System.out.println("\n****** Checkout ******");

        receipt.printReceipt();
        receipt.saveReceiptToFile();

        System.out.println("Proceed to checkout? (yes/no):");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("yes")) {
            checkout.finalizeOrder();
        } else {
            System.out.println("Checkout canceled. You can continue adding items.");
        }
    }
}
