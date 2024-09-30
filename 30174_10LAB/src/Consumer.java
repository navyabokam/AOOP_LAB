class Consumer implements Runnable {
    private SharedBuffer buffer;
    private int messageCount;

    public Consumer(SharedBuffer buffer, int messageCount) {
        this.buffer = buffer;
        this.messageCount = messageCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= messageCount; i++) {
                buffer.consume(); // Consume a message
                Thread.sleep(1000); // Simulate delay in consuming messages
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer interrupted.");
        }
    }
}