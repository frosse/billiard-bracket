package com.frieze.bracket;

import com.frieze.bracket.data.Player;
import com.frieze.bracket.data.PlayerData;
import com.frieze.bracket.data.PlayerList;
import com.frieze.bracket.data.PlayerPool;
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
//        PlayerData pd = PlayerData.getInstance();
//        Player player1 = new Player("seppo");
//        Player player2 = new Player("jorma");
//        PlayerSelect ps = new PlayerSelect(32);
        PlayerList ps = new PlayerList("viikkokisat");
        PlayerPool pl = PlayerPool.getInstance();

        FirstWindow fw = new FirstWindow();





    }
}
