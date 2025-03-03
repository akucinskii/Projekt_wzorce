package payment.card;

import payment.interfaces.ReceiptGenerator;

public class CardReceiptGenerator implements ReceiptGenerator {
    @Override
    public String generateReceipt(String transactionId, double amount) {
        return "Credit Card Receipt #" + transactionId + " for $" + amount;
    }
}