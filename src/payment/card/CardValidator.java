package payment.card;

import payment.interfaces.TransactionValidator;

public class CardValidator implements TransactionValidator {
    @Override
    public boolean validateTransaction(String transactionId) {
        System.out.println("Validating credit card transaction: " + transactionId);
        return true;
    }
}