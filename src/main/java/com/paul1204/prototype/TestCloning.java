package com.paul1204.prototype;

public class TestCloning {
    public static void main(String[] args){
        CloneFactory animalMaker = new CloneFactory();
        Sheep sheep1 = new Sheep();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sheep1);

        System.out.println(sheep1);
        System.out.println(clonedSheep);
        System.out.println("Sheep 1      hashcode: " + System.identityHashCode(sheep1));
        System.out.println("Cloned Sheep hashcode: " + System.identityHashCode(clonedSheep));

    }
}
