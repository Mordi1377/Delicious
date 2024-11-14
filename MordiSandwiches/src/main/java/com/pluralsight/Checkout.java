package com.pluralsight;

public class Checkout {
    private Order order;
    private double totalPrice;
    private boolean isFinalized;

    public Checkout(Order order) {
        this.order = order;
        this.totalPrice = calculateTotal();
        this.isFinalized = false;
    }

    private double calculateTotal() {
        double baseTotal = order.calculateTotalPrice();
        return baseTotal;
    }
    public void finalizeOrder() {
        if (order.getItems().isEmpty()) {
            System.out.println("Order is empty. Cannot proceed to checkout.");
        } else {
            this.isFinalized = true;
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isFinalized() {
        return isFinalized;
    }

}
