package com.frieze.bracket.data;

import java.util.ArrayList;

//Stores every player


public class PlayerData {

    private static PlayerData firstInstance = null;

    public ArrayList<Player> playerLists;

    private PlayerData(){}

    public static PlayerData getInstance(){
        if(firstInstance == null) {
            firstInstance = new PlayerData();
        }
        return firstInstance;
    }

    public ArrayList<Player> getPlayerLists() {

        return playerLists;
    }

    public void setPlayerLists(ArrayList<Player> playerLists) {

        this.playerLists = playerLists;
    }
    public void addPlayer(Player player){
        if(playerLists == null)
            playerLists = new ArrayList<>();

        playerLists.add(player);

    }
}
