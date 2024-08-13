public class Main {
    public static void main(String[] args) {
        // Using EmailService
        MessageService emailService = new EmailService();
        MyApplication app1 = new MyApplication(emailService);
        app1.processMessage("Hello, Email!", "email@example.com");

        // Using SMSService
        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessage("Hello, SMS!", "123-456-7890");
    }
}