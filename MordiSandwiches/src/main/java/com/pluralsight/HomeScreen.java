package com.pluralsight;
import java.util.Scanner;

public class HomeScreen {
    private Scanner scanner;

    public HomeScreen(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("********* Welcome to Zaid's Sandwiches! *********");
        boolean running = true;

        while (running) {
            System.out.println("1) Create New Order");
            System.out.println("X) Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                    OrderScreen orderScreen = new OrderScreen(scanner);
                    orderScreen.display();
                    break;
                case "X":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        System.out.println("*****  Thank you for visiting!  ******");
    }
}


