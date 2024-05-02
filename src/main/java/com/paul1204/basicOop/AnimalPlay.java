package com.paul1204.basicOop;

public class AnimalPlay {

    public static void main(String[] args){
        Animal henry = new Dog();
        Animal birdy = new Bird();

        System.out.println("Dog: " + henry.tryToFly());
        System.out.println("Bird: " + birdy.tryToFly());


    }
}
