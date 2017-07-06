package com.frieze.bracket.UI;


import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class FirstWindowGridPane extends GridPane{

    private ToggleButton button16;
    private ToggleButton button32;
    private ToggleButton button64;
    private ToggleGroup buttonGroup;
    private Label playerAmount;


    public FirstWindowGridPane() {
        buttonGroup = new ToggleGroup();
        button16 = new ToggleButton("16");
        button32 = new ToggleButton("32");
        button64 = new ToggleButton("64");
        playerAmount = new Label("How many players:");
        setButtonGroupForToggleButtons();
        setAlignment(Pos.CENTER);
        addElementsToGroup();


    }

    public void addElementsToGroup(){
        add(button16,2,1);
        add(button32,3,1);
        add(button64,4,1);
        add(playerAmount,2,0,3,1);
    }


    public void setButtonGroupForToggleButtons(){
        button16.setToggleGroup(buttonGroup);
        button32.setToggleGroup(buttonGroup);
        button64.setToggleGroup(buttonGroup);
    }
}
