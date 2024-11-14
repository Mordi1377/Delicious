package com.pluralsight;

public class Chips implements Orderable{
    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public String toString() {
        return type + " Chips";
    }
}

