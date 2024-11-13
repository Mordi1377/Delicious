package com.pluralsight;

public class Topping {
    private String name;
    private boolean extra;

    public Topping(String name, boolean extra) {
        this.name = name;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public double calculatePrice() {
        if (extra) {
            return 0.75;
        } else {
            return 0.5;
        }
    }
        @Override
        public String toString () {
            if (extra) {
                return name + " (extra)";
            } else {
                return name;
            }
        }
    }
