package com.frieze.bracket.UI;


import com.frieze.bracket.data.PlayerList;
import com.frieze.bracket.data.PlayerPool;
import com.sun.org.apache.bcel.internal.generic.INEG;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class FirstWindowGridPane extends GridPane{

    private Button newPlayerPoolButton;
    private Button nextWindowsButton;
    private ToggleButton button16;
    private ToggleButton button32;
    private ToggleButton button64;
    private ToggleGroup buttonGroup;
    private Label playerAmount;
    private ComboBox<PlayerList> playerPoolCombobox;
    private PlayerPool playerPool;



    public FirstWindowGridPane() {
        playerPool = PlayerPool.getInstance();
        buttonGroup = new ToggleGroup();
        newPlayerPoolButton = new Button("New player pool");
        button16 = new ToggleButton("16");
        button16.setUserData("16");
        button32 = new ToggleButton("32");
        button32.setUserData("32");
        button64 = new ToggleButton("64");
        button64.setUserData("64");
        nextWindowsButton = new Button("Next");

        playerPoolCombobox = new ComboBox();
        setPlayerPoolCombobox();
        playerAmount = new Label("How many players:");
        setButtonGroupForToggleButtons();
        setAlignment(Pos.CENTER);
        addElementsToGroup();


    }

    public void setPlayerPoolCombobox() {

        playerPool.getPlayerPoolList().forEach(e -> playerPoolCombobox.getItems().addAll(e));

    }
    public void updateCombobox(){
        playerPoolCombobox.getItems().clear();
        playerPool.getPlayerPoolList().forEach(e -> playerPoolCombobox.getItems().addAll(e));
    }


    public void addElementsToGroup(){
        add(button16,2,2);
        add(button32,3,2);
        add(button64,4,2);
        add(playerAmount,2,1,3,1);
        add(playerPoolCombobox,1,0);
        add(newPlayerPoolButton,0,0);
        add(nextWindowsButton,0,5);
    }

    public Button getNewPlayerPoolButton() {
        return newPlayerPoolButton;
    }

    public void setButtonGroupForToggleButtons(){
        button16.setToggleGroup(buttonGroup);
        button32.setToggleGroup(buttonGroup);
        button64.setToggleGroup(buttonGroup);
    }

    public ComboBox<PlayerList> getPlayerPoolCombobox() {

        return playerPoolCombobox;
    }
    public int getPlayerAmount(){

        return Integer.parseInt(buttonGroup.getSelectedToggle().getUserData().toString());
    }

    public PlayerList getSelectedPlayerList(){
        return playerPoolCombobox.getSelectionModel().getSelectedItem();
    }


    public Button getNextWindowsButton() {
        return nextWindowsButton;
    }
}
