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
        System.out.println("Do you want a drink? (yes/no)");
        String response = scanner.nextLine().trim().toLowerCase();

        if (!response.equals("yes")) {
            System.out.println("No drink selected. Returning to the main menu.");
            return;
        }

        System.out.println("Select drink size (type the number):");
        System.out.println("1) Small\n2) Medium\n3) Large");

        int sizeChoice = scanner.nextInt();
        scanner.nextLine();
        String size = null;

        switch (sizeChoice) {
            case 1:
                size = "Small";
                break;
            case 2:
                size = "Medium";
                break;
            case 3:
                size = "Large";
                break;
            default:
                System.out.println("Invalid size choice. Please select a valid number.");
                return;
        }

        System.out.println("Select drink flavor (type the flavor number):");
        System.out.println("1) Coca\n2) Dr. Pepper\n3) Fanta\n4) Diet Coke\n5) Lemonade");

        int flavorChoice = scanner.nextInt();
        scanner.nextLine();
        String flavor = null;

        switch (flavorChoice) {
            case 1:
                flavor = "Coca";
                break;
            case 2:
                flavor = "Dr. Pepper";
                break;
            case 3:
                flavor = "Fanta";
                break;
            case 4:
                flavor = "Diet Coke";
                break;
            case 5:
                flavor = "Lemonade";
                break;
            default:
                System.out.println("Invalid flavor choice. Please select a valid number.");
                return;
        }

        Drink drink = new Drink(size, flavor);
        order.addItem(drink);
        System.out.println("Added " + size + " " + flavor + " drink to the order.");
    }
}
