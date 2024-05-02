package com.paul1204.basicOop;
public class Dog extends Animal{
    public void digHole(){
        System.out.println("Diggin");
    }

    public Dog() {
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }
    public void changeVar(int randNum){
        randNum = 12;
        System.out.println("RandNum in method " + randNum);
    }
    private void bePrivate(){
        System.out.println("private");

    }
    public void accessPrivate(){
        bePrivate();
    }
}