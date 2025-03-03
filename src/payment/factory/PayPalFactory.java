package payment.factory;

import payment.interfaces.PaymentProcessor;
import payment.interfaces.TransactionValidator;
import payment.interfaces.ReceiptGenerator;
import payment.paypal.PayPalProcessor;
import payment.paypal.PayPalValidator;
import payment.paypal.PayPalReceiptGenerator;

public class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PayPalProcessor();
    }

    @Override
    public TransactionValidator createTransactionValidator() {
        return new PayPalValidator();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new PayPalReceiptGenerator();
    }
}