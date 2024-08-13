class MyApplication {
    private MessageService messageService;

    // Constructor injection
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        messageService.sendMessage(message, receiver);
    }
}