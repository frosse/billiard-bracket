package com.frieze.bracket.data;

import java.util.ArrayList;

//This class stores players to ArrayList.
//Every tournament has different PlayerList that is stored in PlayerPool class

public class PlayerList{

    private ArrayList<Player> playerList;
    private String playerPoolName;
    private PlayerPool playerPool;

    public PlayerList(String playerPoolName) {
        this.playerPoolName = playerPoolName;
        System.out.println(playerPoolName);
        playerPool = PlayerPool.getInstance();
        playerList = new ArrayList<>();
        playerPool.add(this);

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


    @Override
    public String toString() {
        return playerPoolName;
    }
}
