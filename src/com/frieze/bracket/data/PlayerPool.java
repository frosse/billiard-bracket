package com.frieze.bracket.data;

import java.util.ArrayList;

//

public class PlayerPool {

    private ArrayList<PlayerList> playerPoolList;


    public PlayerPool(){
        if(playerPoolList == null)
            playerPoolList = new ArrayList<>();

    }
    public void add(PlayerList playerList){

        playerPoolList.add(playerList);

    }
}
