public class ShipOrderStep implements OrderProcessStep {
    @Override
    public void execute(Order order) {
        System.out.println("Shipping order " + order.getId());
        // Add shipping logic here
    }
}