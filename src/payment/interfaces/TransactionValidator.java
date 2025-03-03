package payment.interfaces;

public interface TransactionValidator {
    boolean validateTransaction(String transactionId);
}