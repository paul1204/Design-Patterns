package com.paul1204.observer.weather;

public class WeatherNotificationHandler implements NotificationHandler{
    @Override
    public void notify(Object data) {
        float[] weatherData = (float[]) data;
        displayWeather(weatherData[0], weatherData[1], weatherData[2]);
    }

    public void displayWeather(float temperature, float humidity, float pressure) {
        System.out.println("Weather Update: " + temperature + "F degrees, "
                + humidity + "% humidity, " + pressure + " pressure");
    }
}
