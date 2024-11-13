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
        double price = 5.5;

        if (size.equals("8\"")) {
            price += 1.5;
        } else if (size.equals("12\"")) {
            price += 3;
        }

        price += meats.size() * 1.5 + cheeses.size();

        return price;
    }

    @Override
    public String toString() {
        return size + " " + breadType + " Sandwich with " + String.join(", ", meats) + ", " + String.join(", ", cheeses) + ", " + String.join(", ", toppings) + " " +
                "(Toasted: " + isToasted + ")";
    }
}
