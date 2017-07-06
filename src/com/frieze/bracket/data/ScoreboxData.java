package com.frieze.bracket.data;

/*This class holds all scoreboxes so they are available*/

import java.util.ArrayList;

public class ScoreboxData {

    private static ScoreboxData firstInstance = null;

//    private ArrayList<ScoreBox> scoreboxList;
    private ScoreboxData(){}

    public static ScoreboxData getInstance(){

        if(firstInstance == null) {
            firstInstance = new ScoreboxData();
        }
        return firstInstance;

    }

//    public ArrayList<ScoreBox> getScoreboxList() {
//        return scoreboxList;
//    }
}
