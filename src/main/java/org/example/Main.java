package org.example;

// Step 1: Define the PaymentMethod interface
interface PaymentMethod {
    void pay();
}

// Step 2: Implement specific payment methods
class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Processing PayPal payment...");
    }
}
class Gpay implements PaymentMethod{
    @Override
    public void pay()
    {
        System.out.println("Processing Gpay payment...");
    }
}

// Step 3: Use polymorphism to process payments
class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}

// Step 4: Demonstrate the implementation
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Pay using credit card
        PaymentMethod creditCard = new CreditCardPayment();
        processor.processPayment(creditCard);

        // Pay using PayPal
        PaymentMethod gpay = new Gpay();
        processor.processPayment(gpay);
    }
}
