package com.pluralsight;
import java.util.Scanner;

public class SandwichScreen {
    private Scanner scanner;
    private Order order;

    public SandwichScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("Select bread type (type the number):");
        System.out.println("1) white\n2) wheat\n3) rye\n4) wrap):");
        String bread = scanner.nextLine();
//        int breadChoice = scanner.nextInt();
//        switch (breadChoice) {
//            case 1:
//                bread = "White";
//                break;
//            case 2:
//                bread = "wheat";
//            case 3:
//                bread = "rye";
//            case 4:
//                bread = "wrap";
//                break;
//            default:
//                System.out.println("Invalid choice. please select a valid number.");
//        }


        System.out.println("Select sandwich size (4\", 8\", 12\"):");
        String size = scanner.nextLine();

        System.out.println("Would you like the sandwich toasted? (yes/no):");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, bread, toasted);

        System.out.println("Select meats (type the number):");
        System.out.println("1) Steak\n2) Ham\n3) Salami\n4) Roast Beef\n5) Chicken\n6) Bacon):");
        while (true) {
            System.out.print("Enter choice (or type 'done' to finish): ");
            String choice = scanner.nextLine().trim();
            if (choice.equalsIgnoreCase("done")) {
                break;
            }
            String meat = null;
            switch (choice) {
                case "1":
                    meat = "Steak";
                    break;
                case "2":
                    meat = "Ham";
                    break;
                case "3":
                    meat = "Salami";
                    break;
                case "4":
                    meat = "Roast Beef";
                    break;
                case "5":
                    meat = "Chicken";
                    break;
                case "6":
                    meat = "Bacon";
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }
            System.out.print("Add extra " + meat + "? (yes/no): ");
            boolean extra = scanner.nextLine().trim().equalsIgnoreCase("yes");
            sandwich.addMeat(meat, extra);
            if (!extra) break;
        }

        System.out.println("Select cheeses (type the number):");
        System.out.println("1) American\n2) Provolone\n3) Cheddar\n4) Swiss");
        while (true) {
            System.out.print("Enter choice (or type 'done' to finish): ");
            String choice = scanner.nextLine().trim();
            if (choice.equalsIgnoreCase("done")) {
                break;
            }

            String cheese = null;
            switch (choice) {
                case "1":
                    cheese = "American";
                    break;
                case "2":
                    cheese = "Provolone";
                    break;
                case "3":
                    cheese = "Cheddar";
                    break;
                case "4":
                    cheese = "Swiss";
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }

            System.out.print("Add extra " + cheese + "? (yes/no): ");
            boolean extraCheese = scanner.nextLine().trim().equalsIgnoreCase("yes");
            sandwich.addCheese(cheese, extraCheese);
            if (!extraCheese) break;
        }
        System.out.println("Select toppings (type the number):");
        System.out.println("1) Lettuce\n2) Peppers\n3) Onions\n4) Tomatoes\n5) Jalapenos\n6) Cucumbers\n7) Pickles\n8) Guacamole\n9) Mushrooms");
        while (true) {
            System.out.print("Enter choice (or type 'done' to finish): ");
            String choice = scanner.nextLine().trim();
            if (choice.equalsIgnoreCase("done")) {
                break;
            }
            String topping = null;
            switch (choice) {
                case "1":
                    topping = "Lettuce";
                    break;
                case "2":
                    topping = "Peppers";
                    break;
                case "3":
                    topping = "Onions";
                    break;
                case "4":
                    topping = "Tomatoes";
                    break;
                case "5":
                    topping = "Jalapenos";
                    break;
                case "6":
                    topping = "Cucumbers";
                    break;
                case "7":
                    topping = "Pickles";
                    break;
                case "8":
                    topping = "Guacamole";
                    break;
                case "9":
                    topping = "Mushrooms";
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }
            sandwich.addTopping(topping);
        }
        System.out.println("Select sauces (type the number):");
        System.out.println("1) Mayo\n2) Mustard\n3) Ketchup\n4) Ranch\n5) Thousand Islands\n6) Vinaigrette");
        while (true) {
            System.out.print("Enter choice (or type 'done' to finish): ");
            String choice = scanner.nextLine().trim();
            if (choice.equalsIgnoreCase("done")) {
                break;
            }

            String sauce = null;
            switch (choice) {
                case "1":
                    sauce = "Mayo";
                    break;
                case "2":
                    sauce = "Mustard";
                    break;
                case "3":
                    sauce = "Ketchup";
                    break;
                case "4":
                    sauce = "Ranch";
                    break;
                case "5":
                    sauce = "Thousand Islands";
                    break;
                case "6":
                    sauce = "Vinaigrette";
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }

            sandwich.addSauce(sauce);
        }

        order.addItem(sandwich);
        System.out.println("Sandwich added to the order.");
    }
}
