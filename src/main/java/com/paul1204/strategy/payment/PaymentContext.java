package com.paul1204.strategy.payment;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount){
        if(paymentStrategy != null){
            paymentStrategy.processPayment(amount);
        }
        else{
            System.out.println("No Payment Type Selected");
        }

    }

}

