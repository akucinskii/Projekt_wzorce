package payment;

import payment.factory.PaymentFactory;
import payment.interfaces.PaymentProcessor;
import payment.interfaces.TransactionValidator;
import payment.interfaces.ReceiptGenerator;

public class PaymentService {
    private final PaymentProcessor processor;
    private final TransactionValidator validator;
    private final ReceiptGenerator receiptGenerator;

    public PaymentService(PaymentFactory factory) {
        this.processor = factory.createPaymentProcessor();
        this.validator = factory.createTransactionValidator();
        this.receiptGenerator = factory.createReceiptGenerator();
    }

    public void executePayment(String transactionId, double amount) {
        System.out.println("Starting payment processing...");

        boolean paymentProcessed = processor.processPayment(amount);
        if (!paymentProcessed) {
            System.out.println("Payment processing failed!");
            return;
        }

        boolean isValid = validator.validateTransaction(transactionId);
        if (!isValid) {
            System.out.println("Transaction validation failed!");
            return;
        }

        String receipt = receiptGenerator.generateReceipt(transactionId, amount);
        System.out.println("Payment successful! Receipt generated:");
        System.out.println(receipt);
        System.out.println("Payment process completed.");
    }
}