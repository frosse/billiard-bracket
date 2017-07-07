package com.frieze.bracket.data;

import java.util.ArrayList;
import java.util.stream.Stream;

//this class holds all different playerlists for different tournaments.

public class PlayerPool{

    private static PlayerPool firstInstance = null;
    private ArrayList<PlayerList> playerPoolList;

    private PlayerPool(){

        playerPoolList = new ArrayList<>();
    }

    public static PlayerPool getInstance() {
        if(firstInstance == null)
            firstInstance = new PlayerPool();
        return firstInstance;
    }

    public ArrayList<PlayerList> getPlayerPoolList() {

        return playerPoolList;
    }
    public void add(PlayerList list){

        if(playerPoolList.stream().anyMatch(p -> p.getPlayerPoolName().equals(list.getPlayerPoolName()))){

        }else {
            playerPoolList.add(list);
        }
        playerPoolList.forEach(e -> System.out.println("PlayerLists: " + e.getPlayerPoolName()));
    }

    private void checkForDuplicates(PlayerList e) {
        e.getPlayerPoolName();
    }
}
