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
        System.out.println("Select your bread (white, wheat, rye, wrap):");
        String bread = scanner.nextLine();

        System.out.println("Select sandwich size (4\", 8\", 12\"):");
        String size = scanner.nextLine();

        System.out.println("Would you like the sandwich toasted? (yes/no):");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, bread, toasted);

        System.out.println("Add meats (Steak, Ham, Salami, Roast Beef, Chicken, Bacon):");
        String topping;
        while (!(topping = scanner.nextLine()).equalsIgnoreCase("done")) {
            System.out.println("Add extra meat? (yes/no):");
            String extraResponse = scanner.nextLine().trim().toLowerCase();

            while (!extraResponse.equals("yes") && !extraResponse.equals("no")) {
                System.out.println("Invalid input. Please enter 'yes' or 'no':");
                extraResponse = scanner.nextLine().trim().toLowerCase();
            }

            boolean extra = extraResponse.equals("yes");
            sandwich.addMeat(topping, extra);

            if (!extra) {
                break;
            }

            System.out.println("Add another meat or type 'done' to finish:");
        }


        System.out.println("Add cheeses (American, Provolone, Cheddar, Swiss):");
        while (!(topping = scanner.nextLine()).equalsIgnoreCase("done")) {
            System.out.println("Add extra cheese? (yes/no):");
            String extraCheeseResponse = scanner.nextLine().trim().toLowerCase();


            while (!extraCheeseResponse.equals("yes") && !extraCheeseResponse.equals("no")) {
                System.out.println("Invalid input. Please enter 'yes' or 'no':");
                extraCheeseResponse = scanner.nextLine().trim().toLowerCase();
            }

            boolean extraCheese = extraCheeseResponse.equals("yes");
            sandwich.addCheese(topping, extraCheese);

            if (!extraCheese) {
                break;
            }

            System.out.println("Add another cheese or type 'done' to finish:");
        }


        System.out.println("Add regular toppings (lettuce, peppers, onions, tomatoes, jalepenos, cucumbers, pickles, guacamole, mushrooms):");
        while (!(topping = scanner.nextLine()).equalsIgnoreCase("done")) {
            sandwich.addTopping(topping);
            System.out.println("Add another topping or type 'done' to finish:");

        }

        System.out.println("Select sauces (mayo, mustard, ketchup, ranch, thousand islands, vinaigrette):");
        while (!(topping = scanner.nextLine()).equalsIgnoreCase("done")) {
            sandwich.addSauce(topping);
            System.out.println("Add another sauce or type 'done' to finish:");
        }
        order.addItem(sandwich);
        System.out.println("Sandwich added to the order.");
    }
}
