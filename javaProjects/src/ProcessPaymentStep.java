public class ProcessPaymentStep implements OrderProcessStep {
    @Override
    public void execute(Order order) {
        System.out.println("Processing payment for order " + order.getId());
        // Add payment processing logic here
    }
}