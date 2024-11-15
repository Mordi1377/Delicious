# Delicious Ordering Application
### _Overview_
The Delicious Ordering Application is a command-line interface (CLI) application designed to take customer orders for a variety of items, including sandwiches, chips, and drinks. Users can select various options, sizes, and add-ons to customize their orders. The application supports an easy way to manage and view orders.

## _Features_
- Order Customization: Allows users to customize sandwiches, choose chip types, and select drinks with different sizes and flavors.
- Flexible Input Options: Users can select item types, sizes, and toppings by typing numbers or names as prompted, with an option to return to the main menu.
- Order Management: Items added to the order are stored and displayed with pricing and customization details.
- Exit Options: Users can type "X" to return to the main menu at any point or skip items by choosing "no."
## _Project Structure_
## _Classes_
- Main: Entry point of the application, initializes the main menu and directs users to specific order screens.
- HomeScreen: Main menu where users can select items to order or exit the application.
- OrderScreen: Provides an overview of the items added to the order, displaying item details and total cost.
- SandwichScreen: Allows users to customize a sandwich, including bread type, size, meats, cheeses, toppings, and sauces.
- ChipsScreen: Allows users to select from available chip types and add them to the order.
- DrinkScreen: Enables users to select a drink size and flavor, with an option to skip if they don’t want a drink.
- Order: Manages the list of items in the order, provides methods to add and display items, and calculates the total cost.
- Receipt: Generates a summary of the order with all items and the total cost.

## _Interface_
- Orderable: Interface that ensures each item class includes a getPrice() method to standardize pricing calculations.

## Setup
### Requirements

- Java Development Kit (JDK) installed on your machine.
- A terminal or command-line tool to run the application.
## _How it Works_
Main Menu
- When the application starts, the Main Menu displays options to order a Sandwich, Chips, Drink, or View Order.
- Selecting an item takes the user to a customization screen for that item.
## Order Items
1. Sandwich:
- Choose bread type, size, and customize with meats, cheeses, toppings, and sauces.
- Each section provides options for selection with a typeable number.
2. Chips:
- Select from available chip types. Users can add multiple chip orders as needed.
3. Drink:
- Choose a drink size and flavor.
- Users can skip the drink if they prefer, or return to the main menu by typing "X."
## _Order Review and Checkout_
- Once items are added, users can select View Order to see all items, each with customization details and prices.
- The total cost of the order is calculated and displayed at the bottom of the order review.
## _Screenshoots_
### Order Menu
![order_menu](https://github.com/user-attachments/assets/1a552443-e92d-4f06-b7a6-2918c3d75f2c)
### Main Menu

![order_menu](https://github.com/user-attachments/assets/c53ba48b-397d-4fa7-8fd5-0715ebbd8d54)
### Sandwich Menu

![SandwichMenu](https://github.com/user-attachments/assets/b300e9f3-c4eb-4aaa-b982-810f530e6693)
### Drink Menu
![Drink_Menu](https://github.com/user-attachments/assets/0c341660-8f8a-41b1-be6e-c51d1580500b)
### Chips Menu
![Chips_Menu](https://github.com/user-attachments/assets/a288bf12-c631-4424-a78a-72c4bdcd9c07)
### Order Summary
![Order_Summary](https://github.com/user-attachments/assets/f0688751-722c-4f7f-8226-86ea063cea9a)
