package com.paul1204.observer.weather;

public class EmailNotificationHandler implements NotificationHandler{

    @Override
    public void notify(Object data) {
        String emailContents = (String) data;
        displayEmail(emailContents);
    }

    public void displayEmail(String emailContents){
        System.out.println(emailContents);
    }
}
