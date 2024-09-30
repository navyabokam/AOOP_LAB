public class MessagingApp {
    public static void main(String[] args) {
        // Shared buffer with capacity for 5 messages
        SharedBuffer buffer = new SharedBuffer(5);

        // Create producer and consumer with message counts
        Producer producer = new Producer(buffer, 10);
        Consumer consumer = new Consumer(buffer, 10);

        // Start producer and consumer threads
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}