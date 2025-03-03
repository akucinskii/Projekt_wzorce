package payment.interfaces;

public interface ReceiptGenerator {
    String generateReceipt(String transactionId, double amount);
}