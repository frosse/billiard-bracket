package com.frieze.bracket.logic;


import com.frieze.bracket.UI.AddPlayerPoolUI;

public class AddPlayerPool {

    private AddPlayerPoolUI addPlayerPoolUI;


    public AddPlayerPool() {
        System.out.println("Initialized add player pool window");
        addPlayerPoolUI = new AddPlayerPoolUI();
        addPlayerPoolUI.showStage();

    }
}
