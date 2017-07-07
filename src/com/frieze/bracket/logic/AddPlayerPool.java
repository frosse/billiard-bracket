package com.frieze.bracket.logic;


import com.frieze.bracket.UI.AddPlayerPoolUI;
import com.frieze.bracket.data.PlayerList;
import com.frieze.bracket.data.PlayerPool;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;

public class AddPlayerPool {

    private AddPlayerPoolUI addPlayerPoolUI;
    private PlayerPool playerPool;
    private PlayerList playerList;


    public AddPlayerPool() {
        System.out.println("Initialized add player pool window");
        playerPool = PlayerPool.getInstance();
        addPlayerPoolUI = new AddPlayerPoolUI();
        setListener();
        addPlayerPoolUI.showStage();

    }

    private void setListener() {
        addPlayerPoolUI.getAddPlayerPoolGridpane().getSaveButton().setOnAction(e -> makePlayerList(getData()));
    }

    private void makePlayerList(String name) {
        playerList = new PlayerList(name);
        addPlayerPoolUI.closeStage();

    }

    private String getData() {
        return addPlayerPoolUI.getAddPlayerPoolGridpane().getPlayerPoolName().textProperty().get();
    }

}
