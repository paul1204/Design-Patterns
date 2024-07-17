package com.paul1204.observer.weather;

public interface Observer {
    //void update(float temperature, float humidity, float pressure);
    void update(Subject subject, Object data);
}
