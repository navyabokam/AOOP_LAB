public class Main {
    public static void main(String[] args) {
        Order order = new Order("1234", 99.99);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addStep(new ValidateOrderStep());
        orderProcessor.addStep(new ProcessPaymentStep());
        orderProcessor.addStep(new ShipOrderStep());

        orderProcessor.process(order);
    }
}
