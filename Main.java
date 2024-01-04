import model.Order;
import model.T_shirt;

public class Main {
    public static void main(String[] args) {
        // Create T-shirt objects
        T_shirt tShirt1 = new T_shirt("Bhairav", "Karuna", "Lord Bhairav design\n\t\t\t 100% cotton", "653",
                2000, new String[]{"S", "M", "L", "XL"});

        // Describe the T-shirt
        tShirt1.describeTShirt();

        // Create Order objects
        Order order1 = new Order("Dipshika Rai", "973545700",
                new int[]{3}, new double[]{2000.0});

        // Print the bill with VAT
        order1.printBill();

    }
}