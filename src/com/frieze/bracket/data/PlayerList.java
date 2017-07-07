package com.frieze.bracket.data;

import java.util.ArrayList;

//This class stores players to ArrayList.
//And have name so you can choose different playerpool for different tournaments.
public class PlayerList extends ArrayList{

    private ArrayList<Player> playerList;
    private String playerPoolName;

    public PlayerList(String playerPoolName) {
        this.playerPoolName = playerPoolName;
        playerList = new ArrayList<>();

        }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public String getPlayerPoolName() {
        return playerPoolName;
    }

    public void setPlayerPoolName(String playerPoolName) {
        this.playerPoolName = playerPoolName;
    }
}
