package com.pluralsight;

public class Chips {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public double calculatePrice() {
        return 1.0; // Fixed price for chips
    }

    @Override
    public String toString() {
        return type + " Chips";
    }
}

