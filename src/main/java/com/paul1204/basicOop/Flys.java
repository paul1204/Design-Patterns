package com.paul1204.basicOop;

public interface Flys {
    String fly();
}

class ItFlys implements Flys{

    public String fly(){
        return "Flying High";
    }
}

class CantFly implements Flys{

    public String fly(){
        return "I can't Fly";
    }
}
