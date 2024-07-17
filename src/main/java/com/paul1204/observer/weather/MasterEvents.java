package com.paul1204.observer.weather;

public class MasterEvents {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        EmailData emailData = new EmailData();

        ComplexObserver complexObserver = new ComplexObserver(weatherData, emailData);

        weatherData.setMeasurements(80, 65, 30.f);
        emailData.setEmailContents("You got mail");

        weatherData.setMeasurements(801, 655, 34.f);
        emailData.setEmailContents("You got mail!!!!");
    }
}
