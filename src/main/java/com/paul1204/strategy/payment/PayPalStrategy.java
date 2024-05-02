package com.paul1204.strategy.payment;

public class PayPalStrategy implements PaymentStrategy{
    String email;
    String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        //Call PayPal API
        System.out.println("PayPal Accepted!");

    }
}
