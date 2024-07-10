package com.paul1204.singleton;
import sun.awt.image.ImageWatched;

import java.util.*;
public class GetTheTiles implements Runnable{
    public void run(){
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTitles(7);
        System.out.println("Player 1: " + playerOneTiles);

        System.out.println("Got Tiles!");

    }
}
