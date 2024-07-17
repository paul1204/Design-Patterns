package com.paul1204.observer.weather;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmailData implements Subject{
    private ArrayList<Observer> observers;
    private String emailContents;

    public EmailData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
    for(Observer observer: observers){
        observer.update(this, emailContents);
    }
    }

    public void setEmailContents(String emailContents){
        this.emailContents = emailContents;
        emailContentsChanged();
    }

    public void emailContentsChanged(){
        notifyObservers();
    }
    public String getEmailContents(){
        return emailContents;
    }
}
