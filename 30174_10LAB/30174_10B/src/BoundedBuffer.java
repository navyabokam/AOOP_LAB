import java.util.LinkedList;
import java.util.Queue;

// Shared Bounded Buffer Class
class BoundedBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private final int MAX_CAPACITY = 10; // Maximum buffer capacity

    // Method to produce items and add to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == MAX_CAPACITY) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait(); // Wait if buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify consumers waiting to consume
    }

    // Method to consume items from the buffer
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait(); // Wait if buffer is empty
        }
        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify producers waiting to produce
        return item;
    }
}

