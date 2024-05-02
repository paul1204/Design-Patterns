package com.paul1204.basicOop;
public class Animal{
    private String name;
    private double height;
    private int weight;
    private String sound;
    private double speed;
    public Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        if(newWeight>0){
            this.weight = newWeight;
        }
    else{
        System.out.println("Invalid weight");
        }
    }

    public void setSpeed(double newSpeed){
        speed = newSpeed;
    }
    public double getSpeed(){
        return speed;
    }
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly(){
        return flyingType.fly();
    }
    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }


}