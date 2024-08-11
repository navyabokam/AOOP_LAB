public class ValidateOrderStep implements OrderProcessStep {
    @Override
    public void execute(Order order) {
        System.out.println("Validating order " + order.getId());
        // Add validation logic here
    }
}