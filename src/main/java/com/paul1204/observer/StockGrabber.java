package com.paul1204.observer;

import java.sql.Array;
import java.util.ArrayList;

public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aapPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
    observers.add(newObserver);
    }

    @Override
    public void unregister(Observer delete) {
        int observerIndex = observers.indexOf(delete);
        System.out.println("Observer" + (observerIndex+1) + "deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(ibmPrice, aapPrice, googPrice);
        }
    }
    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
    public void setAaplPrice(double newAppPrice){
        this.aapPrice = newAppPrice;
        notifyObserver();
    }
    public void setGoogPrice(double newGoogPrice){
        this.googPrice = newGoogPrice;
        notifyObserver();
    }
}
