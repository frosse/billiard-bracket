package com.frieze.bracket.logic;

import com.frieze.bracket.UI.FirstWindowUI;
import com.frieze.bracket.data.Player;

import java.util.ArrayList;


//TODO: PLACEHOLDERNAME
//For user to select playerlist and player amount. Those are used later for making bracket.
public class FirstWindow {

    private FirstWindowUI firstWindowUI;
    private ArrayList<Player> playerList;
    private AddPlayerPoolWindow addPlayerPoolWindow;

    public FirstWindow() {
        firstWindowUI = new FirstWindowUI();
        setListener();
        firstWindowUI.showStage();

    }

    public void setListener(){
        firstWindowUI.getFirstWindowGridPane().getNewPlayerPoolButton().setOnAction(e-> addPlayerPoolWindow = new AddPlayerPoolWindow());
    }
}
