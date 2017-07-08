package com.frieze.bracket.UI;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FirstWindowUI {

    private FirstWindowGridPane firstWindowGridPane;
    private Scene firstWindowScene;
    private Stage firstWindowStage;

    public FirstWindowUI() {

        firstWindowGridPane = new FirstWindowGridPane();
        setScene();
        setStage();

    }


    public void setScene(){
        firstWindowScene = new Scene(firstWindowGridPane,400,400);

    }
    public void setStage(){
        firstWindowStage = new Stage();
        firstWindowStage.setScene(firstWindowScene);
    }
    public void showStage(){
        firstWindowStage.showAndWait();

    }

    public FirstWindowGridPane getFirstWindowGridPane() {
        return firstWindowGridPane;
    }

    public void closeStage() {
        firstWindowStage.close();
    }
}
