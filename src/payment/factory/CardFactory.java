package payment.factory;

import payment.interfaces.PaymentProcessor;
import payment.interfaces.TransactionValidator;
import payment.interfaces.ReceiptGenerator;
import payment.card.CardProcessor;
import payment.card.CardValidator;
import payment.card.CardReceiptGenerator;

public class CardFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CardProcessor();
    }

    @Override
    public TransactionValidator createTransactionValidator() {
        return new CardValidator();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new CardReceiptGenerator();
    }
}