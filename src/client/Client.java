package client;

import payment.factory.PaymentFactory;
import payment.interfaces.PaymentProcessor;
import payment.interfaces.ReceiptGenerator;
import payment.interfaces.TransactionValidator;

public class Client {
    // Add factory instance variable
    private final PaymentFactory factory;

    // Constructor that takes factory as argument
    public Client(PaymentFactory factory) {
        this.factory = factory;
    }

    // Method now uses the instance factory instead of parameter
    public void processTransaction(String transactionId, double amount) {
        PaymentProcessor processor = factory.createPaymentProcessor();
        TransactionValidator validator = factory.createTransactionValidator();
        ReceiptGenerator receipt = factory.createReceiptGenerator();

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

        String receiptText = receipt.generateReceipt(transactionId, amount);
        System.out.println("Payment successful! Receipt generated:");
        System.out.println(receiptText);
        System.out.println("Payment process completed.");
    }
}