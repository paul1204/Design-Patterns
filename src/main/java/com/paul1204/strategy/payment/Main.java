package com.paul1204.strategy.payment;

public class Main{
    public static void main(String[] args){
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy cc = new CreditCardPaymentStrategy("123456789", "12/25", "123");
        paymentContext.setPaymentStrategy(cc);
        paymentContext.executePayment(100.00);

        PaymentStrategy pp = new PayPalStrategy("hi@test.com", "password");
        paymentContext.setPaymentStrategy(pp);
        paymentContext.executePayment(50.00);

    }
}
