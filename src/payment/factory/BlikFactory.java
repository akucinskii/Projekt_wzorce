package payment.factory;

import payment.interfaces.PaymentProcessor;
import payment.interfaces.TransactionValidator;
import payment.interfaces.ReceiptGenerator;
import payment.blik.BlikProcessor;
import payment.blik.BlikValidator;
import payment.blik.BlikReceiptGenerator;

public class BlikFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new BlikProcessor();
    }

    @Override
    public TransactionValidator createTransactionValidator() {
        return new BlikValidator();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new BlikReceiptGenerator();
    }
}