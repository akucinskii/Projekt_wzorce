package payment.paypal;

import payment.interfaces.ReceiptGenerator;

public class PayPalReceiptGenerator implements ReceiptGenerator {
    @Override
    public String generateReceipt(String transactionId, double amount) {
        return "PayPal Receipt #" + transactionId + " for $" + amount;
    }
}