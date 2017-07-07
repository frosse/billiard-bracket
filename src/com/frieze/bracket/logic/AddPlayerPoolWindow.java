package com.frieze.bracket.logic;


import com.frieze.bracket.UI.AddPlayerPoolUI;

public class AddPlayerPoolWindow {

    private AddPlayerPoolUI addPlayerPoolUI;


    public AddPlayerPoolWindow() {
        System.out.println("Initialized add player pool window");
        addPlayerPoolUI = new AddPlayerPoolUI();
        addPlayerPoolUI.showStage();

    }
}
