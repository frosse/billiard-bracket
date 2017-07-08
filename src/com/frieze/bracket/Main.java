package com.frieze.bracket;


import com.frieze.bracket.logic.FirstWindow;
import com.frieze.bracket.logic.PlayerSelect;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FirstWindow fw = new FirstWindow();
        PlayerSelect playerSelect = new PlayerSelect(fw.getFirstWindowUI().getFirstWindowGridPane().getPlayerAmount(), fw.getFirstWindowUI().getFirstWindowGridPane().getSelectedPlayerList());





    }
}
