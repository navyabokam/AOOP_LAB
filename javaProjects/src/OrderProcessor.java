import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private List<OrderProcessStep> steps = new ArrayList<>();

    public void addStep(OrderProcessStep step) {
        steps.add(step);
    }

    public void process(Order order) {
        for (OrderProcessStep step : steps) {
            step.execute(order);
        }
    }
}
