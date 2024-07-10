package com.paul1204.singleton;
import java.util.*;
public class ScrabbleTest {
    public static void main(String[] args){
        Singleton newInstance = Singleton.getInstance();

        //Track if working with same or different object
        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTitles(7);
        System.out.println("Player 1 :" + playerOneTiles);
        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();
        System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTitles(7);
        System.out.println("Player 2 :" + playerTwoTiles);

    }

}
