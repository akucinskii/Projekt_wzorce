package payment.factory;

import payment.interfaces.PaymentProcessor;
import payment.interfaces.TransactionValidator;
import payment.interfaces.ReceiptGenerator;

public interface PaymentFactory {
    PaymentProcessor createPaymentProcessor();

    TransactionValidator createTransactionValidator();

    ReceiptGenerator createReceiptGenerator();
}