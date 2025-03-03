package payment.interfaces;

public interface PaymentProcessor {
    boolean processPayment(double amount);
}