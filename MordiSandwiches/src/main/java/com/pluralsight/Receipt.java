package com.pluralsight;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Receipt {
    private Order order;

    public Receipt(Order order) {
        this.order = order;
    }

    public void printReceipt() {
        System.out.println("\n ******* Receipt *******");
        List<Orderable> items = order.getItems();
        for (Orderable item : items) {
            System.out.println(item.toString() + " - $" + item.getPrice());
        }
        System.out.println("Total Price: $" + order.calculateTotalPrice());
        System.out.println("=====================\n");
    }

    public void saveReceiptToFile() {
        String fileName = "Receipt_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy_HHmmss")) + "receipt.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("***** Receipt *****");
            List<Orderable> items = order.getItems();
            for (Orderable item : items) {
                writer.write(item.toString() + " - $" + item.getPrice() + "\n");
            }
            writer.write("-------------\n");
            writer.write("Total Price: $" + order.calculateTotalPrice() + "\n");
            writer.write("==============\n");
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }

    public void readReceiptFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n***** Reading Receipt *****");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading receipt: " + e.getMessage());
        }
    }
}
