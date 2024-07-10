package com.paul1204.factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args){

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip  theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship(U/R/B)");

        if(userInput.hasNextLine()){
            String typeofShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeofShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        } else System.out.println("Enter a U,R, B");
//
//        if(userInput.hasNextLine()){
//        enemyShipOption = userInput.nextLine();
//        }
//        if(enemyShipOption.equals("U")){
//            theEnemy = new UFOEnemyShip();
//        }
//        if(enemyShipOption.equals("R")){
//theEnemy = new RocketEnemyShip();
//        }
        //doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
