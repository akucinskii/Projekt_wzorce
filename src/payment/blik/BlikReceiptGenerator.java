package payment.blik;

import payment.interfaces.ReceiptGenerator;

public class BlikReceiptGenerator implements ReceiptGenerator {
    @Override
    public String generateReceipt(String transactionId, double amount) {
        return "BLIK Receipt #" + transactionId + " for $" + amount;
    }
}