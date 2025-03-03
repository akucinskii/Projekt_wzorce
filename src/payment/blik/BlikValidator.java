package payment.blik;

import payment.interfaces.TransactionValidator;

public class BlikValidator implements TransactionValidator {
    @Override
    public boolean validateTransaction(String transactionId) {
        System.out.println("Validating BLIK transaction: " + transactionId);
        return true;
    }
}