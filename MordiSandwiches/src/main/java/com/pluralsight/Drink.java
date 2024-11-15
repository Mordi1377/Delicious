package com.pluralsight;

public class Drink implements Orderable {
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    @Override
    public double getPrice() {
        if (size.equalsIgnoreCase("small")) {
            return 1.0;
        } else if (size.equalsIgnoreCase("medium")) {
            return 2.5;
        } else if (size.equalsIgnoreCase("large")) {
            return 3.0;
        } else {
            return 0.0;
        }
    }

    public String getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return size + " " + flavor + " Drink $" + getPrice();
    }
}