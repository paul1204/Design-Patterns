package com.paul1204.prototype;

public class CloneFactory {

    //Any animal subclass
    //No idea what subclass it is, except Animal type
    public Animal getClone(Animal animalSample){
        return animalSample.makeCopy();
    }
}
