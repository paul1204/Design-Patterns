package com.paul1204.basicOop;

public class Bird extends Animal{
    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
