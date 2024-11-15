package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Orderable {
    private String size;
    private String breadType;
    private boolean isToasted;
    private List<String> meats = new ArrayList<>();
    private List<String> cheeses = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();

    public Sandwich(String size, String breadType, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
    }

    public void addMeat(String meat, boolean extra) {
        if (extra) {
            meats.add(meat + " (extra)");
        } else {
            meats.add(meat);
        }
    }

    public void addCheese(String cheese, boolean extra) {
        if (extra) {
            cheeses.add(cheese + " (extra)");
        } else {
            cheeses.add(cheese);
        }
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    @Override
    public double getPrice() {
        double price = switch (size) {
            case "4\"" -> 5.5;
            case "8\"" -> 7.0;
            case "12\"" -> 8.5;
            default -> 5.5;
        };
        price += switch (size) {
            case "4\"" -> price += meats.size() * 1.0;
            case "8\"" -> price += meats.size() * 2.0;
            case "12\"" -> price += meats.size() * 3.0;
            default -> 0;
        };
        price += switch (size) {
            case "4\"" -> price += cheeses.size() * 0.75;
            case "8\"" -> price += cheeses.size() * 1.5;
            case "12\"" -> price += cheeses.size() * 2.25;
            default -> 0;
        };
        return price;
    }

    @Override
    public String toString() {
        String toastedStatus = isToasted ? "(Toasted)" : "";
        return size + " " + breadType + " Sandwich with " +
                String.join(", ", meats) + ", " +
                String.join(", ", cheeses) + ", " +
                String.join(", ", toppings) +
                (!toastedStatus.isEmpty() ? " " + toastedStatus : " ");
    }
}
