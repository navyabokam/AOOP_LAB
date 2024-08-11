public class ExpeditedOrderProcessor extends OrderProcessor {
    public ExpeditedOrderProcessor() {
        addStep(new ValidateOrderStep());
        addStep(new ProcessPaymentStep());
        addStep(new ShipOrderStep());
    }
}
