package com.paul1204.factory;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newType){
        EnemyShip newShip = null;

        if(newType.equals("U")){
            return new UFOEnemyShip();
        }
        if(newType.equals("R")){
            return new RocketEnemyShip();
        }
        if(newType.equals("B")){
        return new BigUFOEnemyShip();
        }
        else{
            return null;
        }
    }
}
