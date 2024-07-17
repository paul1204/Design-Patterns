package com.paul1204.observer.weather;

public class ComplexObserver implements Observer{
    private Subject weatherData;
    private Subject emailData;

    private NotificationHandler emailNotificationHandler;
    private NotificationHandler weatherNotificationHandler;

    public ComplexObserver(Subject weatherData, Subject emailData){
        this.weatherData = weatherData;
        this.emailData = emailData;
        weatherData.registerObserver(this);
        emailData.registerObserver(this);
        this.emailNotificationHandler = new EmailNotificationHandler();
        this.weatherNotificationHandler = new WeatherNotificationHandler();
    }

    @Override
    public void update(Subject subject, Object data) {
if(subject instanceof WeatherData){
    float[] weatherPayload = (float[]) data;
    weatherNotificationHandler.notify(weatherPayload);
    }
if(subject instanceof EmailData){
    String email = (String) data;
    emailNotificationHandler.notify(email);
}
    }
}
