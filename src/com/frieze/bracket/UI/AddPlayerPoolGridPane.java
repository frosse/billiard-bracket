package com.frieze.bracket.UI;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;



public class AddPlayerPoolGridPane extends GridPane{


    private Button saveButton;
    private TextField playerPoolName;
    private Label infoLabel;

    public AddPlayerPoolGridPane() {
        saveButton = new Button("Save and exit");
        playerPoolName = new TextField();
        playerPoolName.setPromptText("Enter name here");
        infoLabel = new Label("Enter name: ");
        addElements();
        setAlignment(Pos.CENTER);
    }

    public void addElements() {
        add(saveButton,5,5);
        add(playerPoolName,4,4);
        add(infoLabel,4,3);
    }

    public Button getSaveButton() {
        return saveButton;
    }

    public TextField getPlayerPoolName() {
        return playerPoolName;
    }
}
