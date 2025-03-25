package com.paul1204.prototype;

public class Sheep implements Animal {

    public Sheep(){
        System.out.println("Sheep is Made Organically");
    }
    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is Being Cloned");

        Sheep sheepObject = null;
        //To Clone, must wrap in try/catch
        try {
            sheepObject = (Sheep) super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sheepObject;
    }
    public String toString(){
        return "Baaa";
    }
}
