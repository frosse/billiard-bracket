package com.frieze.bracket.logic;


import com.frieze.bracket.UI.PlayerSelectUI;
import com.frieze.bracket.data.Player;
import com.frieze.bracket.data.PlayerData;

import com.frieze.bracket.data.PlayerList;
import javafx.scene.control.ComboBox;

import java.util.ArrayList;

public  class PlayerSelect {

    private int playerAmount;
    private ArrayList<ComboBox> comboBoxList = new ArrayList<>();
    private PlayerList playerList;
    private PlayerSelectUI playerSelectUI;

    public PlayerSelect(int playerAmount, PlayerList selectedPlayerList) {
        this.playerAmount = playerAmount;
        this.playerList = selectedPlayerList;
        playerSelectUI = new PlayerSelectUI();
        playerSelectUI.setGridPane(getPlayerAmount());
        setPlayersToComboBoxes(playerSelectUI.getPlayerSelectGridPane().getComboBoxesList());
        playerSelectUI.setScene();
        playerSelectUI.setStage();
        playerSelectUI.showAndWait();


    }


    public void setPlayersToComboBoxes(ArrayList<ComboBox> comboBoxList) {
        PlayerData pd = PlayerData.getInstance();
        for (ComboBox cb : comboBoxList) {
            if (pd.getPlayerLists() == null) {
            } else {
                for (Player p : pd.getPlayerLists()) {
                    cb.getItems().addAll(p);
                }
            }
        }
    }


    //Takes selected Players from comboboxes so we have all players that gonna participate.
    public void getSelectedPlayers() {
        for (ComboBox cmb : comboBoxList) {
            playerList.getPlayerList().add((Player) cmb.getSelectionModel().getSelectedItem());
        }
    }

    public int getPlayerAmount() {
        return playerAmount;
    }

    public void setPlayerAmount(int playerAmount) {
        this.playerAmount = playerAmount;
    }

}
