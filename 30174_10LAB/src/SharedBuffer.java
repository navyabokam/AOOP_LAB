import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Shared Buffer: A thread-safe BlockingQueue
class SharedBuffer {
    private BlockingQueue<String> queue;

    public SharedBuffer(int capacity) {
        queue = new LinkedBlockingQueue<>(capacity);
    }

    // Method to add messages to the buffer
    public void produce(String message) throws InterruptedException {
        queue.put(message); // Puts the message in the queue (waits if full)
        System.out.println("Produced: " + message);
    }

    // Method to consume messages from the buffer
    public String consume() throws InterruptedException {
        String message = queue.take(); // Takes the message from the queue (waits if empty)
        System.out.println("Consumed: " + message);
        return message;
    }
}

