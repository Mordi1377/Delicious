package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Order {
        private List<Orderable> items = new ArrayList<>();
        // List to hold items in the order
        public void addItem(Orderable item) {
            items.add(item);
        }
        public List<Orderable> getItems() {
            return items;
        }
        // calculate the total price all items
        public double calculateTotalPrice() {
            double total = 0;
            for (Orderable item : items) {
                total += item.getPrice();
            }
            return total;
        }
        // display summary of the order
        public void displayOrderSummary() {
            System.out.println("Order Summary:");
            for (Orderable item : items) {
                System.out.println(item + " - $" + item.getPrice());
            }
            System.out.println("Total Price: $" + calculateTotalPrice());
        }
    }



