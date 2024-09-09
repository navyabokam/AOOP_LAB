import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product> {
    private List<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product product) {
        cart.add(product);
    }

    // Remove product from cart
    public void removeProduct(Product product) {
        cart.remove(product);
    }

    // Display products in the cart
    public void displayCart() {
        for (Product product : cart) {
            System.out.println(product);
        }
    }

    // Getter method for cart
    public List<Product> getCart() {
        return cart;
    }

    // Implementing Iterator
    @Override
    public Iterator<Product> iterator() {
        return cart.iterator();
    }
}
