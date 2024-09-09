import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create Products
        Product p1 = new Product(101, "Laptop", 1000.00);
        Product p2 = new Product(102, "Smartphone", 500.00);
        Product p3 = new Product(103, "Headphones", 100.00);

        // Clone a product
        Product p4 = p1.clone();

        // Add products to ShoppingCart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        // Display original cart
        System.out.println("Original Cart:");
        cart.displayCart();

        // Sort using natural ordering (Comparable by price)
        System.out.println("\nCart sorted by price (Comparable):");
        Collections.sort(cart.getCart());  // Sorting using Comparable (natural order)
        cart.displayCart();

        // Sort using custom comparator (Comparator by price in descending order)
        System.out.println("\nCart sorted by price descending (Comparator):");
        Collections.sort(cart.getCart(), new ProductPriceComparator());
        cart.displayCart();

        // Iterate over cart
        System.out.println("\nIterating over cart:");
        for (Product product : cart) {
            System.out.println(product);
        }
    }
}
