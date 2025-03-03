package payment.paypal;

import payment.interfaces.TransactionValidator;

public class PayPalValidator implements TransactionValidator {
    @Override
    public boolean validateTransaction(String transactionId) {
        System.out.println("Validating PayPal transaction: " + transactionId);
        return true;
    }
}