package payment.blik;

import payment.interfaces.PaymentProcessor;

public class BlikProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing BLIK payment of $" + amount);
        return true;
    }
}