package com.pluralsight;

public class Drink implements Orderable {
    private String size;
    private String flavour;

    public Drink(String size, String flavour) {
        this.size = size;
        this.flavour = flavour;
    }

    @Override
    public double getPrice() {
        if ("small".equals(size))
            return 1.5;
        if ("medium".equals(size))
            return 2.0;
        if ("large".equals(size))
            return 2.5;
        return 0;
    }

    @Override
    public String toString() {
        return size + " Drink";
    }
}