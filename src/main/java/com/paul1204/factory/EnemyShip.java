package com.paul1204.factory;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return amtDamage;
    }

    public void setDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip(){
        System.out.println(getName() + " following hero");
    }
    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screeen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does "  + getDamage());
    }

}
