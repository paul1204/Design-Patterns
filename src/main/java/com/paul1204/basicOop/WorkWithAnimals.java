package com.paul1204.basicOop;

public class WorkWithAnimals{
    int justANum = 10;
    public static void main(String[] args){
        Dog d = new Dog();
        d.setName("Sparky");
        System.out.println(d.getName());
        d.digHole();
        d.setWeight(-1);

        int randNum = 10;
        d.changeVar(randNum);
        System.out.println(randNum);
        changeDogName(d);
        System.out.println("Dog name after method call " + d.getName());

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println(doggy.getSound());
        System.out.println(kitty.getSound());

        Animal[] animals = new Animal[4];

        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println(animals[0].getSound());
        System.out.println(animals[1].getSound());

        //doggy.digHole();
        //d.sayHello();
        d.accessPrivate();

        Giraffe g = new Giraffe();
        g.setName("Frank");
        System.out.println(g.getName());
    }

    public void sayHello(){
        System.out.println("Hello");
    }


    public static void changeDogName(Dog d){
        d.setName("Henry");
    }
}