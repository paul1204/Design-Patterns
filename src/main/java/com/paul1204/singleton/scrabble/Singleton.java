package com.paul1204.singleton;
import java.util.*;
public class Singleton {

    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    //Private - only want one. cannot recreate this
    private Singleton(){}
    public static Singleton getInstance(){
        if(firstInstance == null){

            if(firstThread){
                firstThread = false;
                Thread.currentThread();
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
            //Lazy instatiation

            synchronized (Singleton.class){
                if(firstInstance == null){
            firstInstance = new Singleton();
            Collections.shuffle(firstInstance.letterList);}
            }
        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList(){
        return firstInstance.letterList;
    }
    public LinkedList<String> getTitles(int howManyTiles){
        LinkedList<String> titleToSend = new LinkedList<String>();
        for(int i = 0; i <= howManyTiles; i++){
            titleToSend.add(firstInstance.letterList.remove(0));
        }
        return titleToSend;
    }
}



