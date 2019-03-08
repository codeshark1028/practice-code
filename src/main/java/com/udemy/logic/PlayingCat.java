package com.udemy.logic;

public class PlayingCat {

    public static void main(String[] args){

        isCatPlaying(true, 98);
    }
    public static boolean isCatPlaying (boolean summer,int temperature){
        if ((summer == true)&&((temperature >24)&&(temperature <46)))
            return true;
        else if((summer=(true||false))&&((temperature >24)&&(temperature<36)))
            return true;
        else
            return false;
    }
}
