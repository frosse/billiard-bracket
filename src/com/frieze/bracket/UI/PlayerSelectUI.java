package com.frieze.bracket.UI;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class PlayerSelectUI {

    private PlayerSelectGridPane playerSelectGridPane;
    private Scene playerSelectScene;
    private Stage playerSelectStage;

    public PlayerSelectUI(){

        playerSelectGridPane = new PlayerSelectGridPane();
        playerSelectStage = new Stage();

    }

    public void showAndWait(){
        playerSelectStage.show();
    }
    public void setScene(){

        playerSelectScene = new Scene(playerSelectGridPane,400,400);
    }

    public void setStage() {

        playerSelectStage.setScene(playerSelectScene);
    }

    public void setGridPane(int i){

        playerSelectGridPane.addComboboxesToPane(i);
        System.out.println(i);
    }

    public PlayerSelectGridPane getPlayerSelectGridPane() {

        return playerSelectGridPane;
    }

    public void setPlayerSelectGridPane(PlayerSelectGridPane playerSelectGridPane) {
        this.playerSelectGridPane = playerSelectGridPane;
    }
}
