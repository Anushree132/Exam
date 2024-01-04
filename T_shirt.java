package model;

import java.util.Arrays;

public class T_shirt {
    String name , brand , description , product_code;
    double price;
    String[] aviable_sizes;

    public String getName() {
        return name;
    }
    public T_shirt(String name, String brand, String description, String product_code, float price, String[] aviable_sizes) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.product_code = product_code;
        this.price = price;
        this.aviable_sizes = aviable_sizes;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getAviable_sizes() {
        return aviable_sizes;
    }

    public void setAviable_sizes(String[] aviable_sizes) {
        this.aviable_sizes = aviable_sizes;
    }


    public void describeTShirt() {
        System.out.println("\nProduct Description\n");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + product_code);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + Arrays.toString(aviable_sizes));
    }
}
