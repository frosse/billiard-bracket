package com.frieze.bracket.data;

import java.util.ArrayList;

//this class holds all different playerlists for different tournaments.

public class PlayerPool extends ArrayList{

    private static PlayerPool firstInstance = null;

    private PlayerPool(){
    }

    public static PlayerPool getInstance() {
        if(firstInstance == null)
            firstInstance = new PlayerPool();
        return firstInstance;
    }



}
