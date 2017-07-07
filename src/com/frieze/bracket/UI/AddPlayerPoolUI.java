package com.frieze.bracket.UI;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddPlayerPoolUI {

    private AddPlayerPoolGridPane addPlayerPoolGridpane;
    private Scene addPlayerPoolScene;
    private Stage addPlayerPoolStage;

    public AddPlayerPoolUI() {
        addPlayerPoolGridpane = new AddPlayerPoolGridPane();
        setScene();
        setStage();

    }

    private void setStage() {
        addPlayerPoolStage = new Stage();
        addPlayerPoolStage.initModality(Modality.APPLICATION_MODAL);
        addPlayerPoolStage.setScene(addPlayerPoolScene);
    }

    private void setScene() {
        addPlayerPoolScene = new Scene(addPlayerPoolGridpane,250,200);
    }

    public void showStage() {
        addPlayerPoolStage.showAndWait();
    }

    public AddPlayerPoolGridPane getAddPlayerPoolGridpane() {
        return addPlayerPoolGridpane;
    }

    public void closeStage() {
        addPlayerPoolStage.close();
    }
}
