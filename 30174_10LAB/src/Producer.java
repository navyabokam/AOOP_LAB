class Producer implements Runnable {
    private SharedBuffer buffer;
    private int messageCount;

    public Producer(SharedBuffer buffer, int messageCount) {
        this.buffer = buffer;
        this.messageCount = messageCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= messageCount; i++) {
                String message = "Message " + i;
                buffer.produce(message); // Produce a message
                Thread.sleep(500); // Simulate delay in producing messages
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer interrupted.");
        }
    }
}
