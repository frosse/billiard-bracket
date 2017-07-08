package com.frieze.bracket.logic;

import com.frieze.bracket.UI.FirstWindowUI;
import com.frieze.bracket.data.Player;

import java.util.ArrayList;


//TODO: PLACEHOLDERNAME
//For user to select playerlist and player amount. Those are used later for making bracket.
public class FirstWindow {

    private FirstWindowUI firstWindowUI;
    private ArrayList<Player> playerList;
    private AddPlayerPool addPlayerPool;

    public FirstWindow() {
        firstWindowUI = new FirstWindowUI();
        setListener();
        setNextWindowsButtonListener();
        firstWindowUI.showStage();

    }
    public void setNextWindowsButtonListener(){
        firstWindowUI.getFirstWindowGridPane().getNextWindowsButton().setOnAction(e -> firstWindowUI.closeStage());

    }

    public void setListener(){
        firstWindowUI.getFirstWindowGridPane().getNewPlayerPoolButton().setOnAction(e-> listenerActionEvent());
    }

    public void listenerActionEvent(){
        addPlayerPool = new AddPlayerPool();
        firstWindowUI.getFirstWindowGridPane().updateCombobox();

    }

    public FirstWindowUI getFirstWindowUI() {
        return firstWindowUI;
    }
}
