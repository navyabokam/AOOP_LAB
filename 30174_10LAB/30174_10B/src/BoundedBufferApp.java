public class BoundedBufferApp {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        // Start both threads
        producerThread.start();
        consumerThread.start();
    }
}