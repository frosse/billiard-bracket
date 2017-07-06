package com.frieze.bracket.logic;

import com.frieze.bracket.UI.PlayerSelectGridPane;
import com.frieze.bracket.UI.PlayerSelectStage;
import com.frieze.bracket.UI.PlayerSelectUI;
import com.frieze.bracket.data.Player;
import com.frieze.bracket.data.PlayerData;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.util.ArrayList;

public  class PlayerSelect {

    private int playerAmount;
    private ArrayList<ComboBox> comboBoxList = new ArrayList<>();
    private ArrayList<Player> playerList = new ArrayList<>();
    private PlayerSelectUI playerSelectUI;

    public PlayerSelect(int playerAmount) {
        this.playerAmount = playerAmount;
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
            playerList.add((Player) cmb.getSelectionModel().getSelectedItem());
        }
    }

    public int getPlayerAmount() {
        return playerAmount;
    }

    public void setPlayerAmount(int playerAmount) {
        this.playerAmount = playerAmount;
    }

}
