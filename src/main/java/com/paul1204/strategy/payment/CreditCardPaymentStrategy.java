package com.paul1204.strategy.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        //Card Processes
        System.out.println("Accepted!");
    }
}
