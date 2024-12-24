package org.example;

// Step 1: Define the abstraction
interface MessageService {
    void sendMessage(String message);
}

// Step 2: Implement the abstraction
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
class InstagramService implements MessageService{
    @Override
    public void sendMessage(String message)
    {
        System.out.println("Sending message on instagram:"+message);
    }
}
// Step 3: Use Dependency Injection in the high-level module
class Notification {
    private MessageService messageService;

    // Constructor injection
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}


// Step 4: Demonstrate usage
public class Main {
    public static void main(String[] args) {
        // Using EmailService
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.send("Hello via Email!");

        // Using SMSService
        MessageService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.send("Hello via SMS!");

        //Using InstagramService
        MessageService insta=new InstagramService();
        Notification instaNotification=new Notification(insta);
        instaNotification.send("Hello via Instagram!");
    }
}
