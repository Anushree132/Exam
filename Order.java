package model;

import java.util.Arrays;

public class Order {
    public String name;
    public String phoneNumber;
    public int[] items;
    public double[] prices;

    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public void printBill() {
        double totalPrice = 0;

        for (int i = 0; i < items.length; i++) {
            totalPrice += prices[i] * items[i];
        }

        double vat = totalPrice * 0.13;

        System.out.println("\nOrder details\n");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total price with VAT: " + (totalPrice + vat));
    }
}
