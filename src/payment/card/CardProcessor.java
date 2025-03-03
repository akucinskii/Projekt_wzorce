package payment.card;

import payment.interfaces.PaymentProcessor;

public class CardProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        return true;
    }
}