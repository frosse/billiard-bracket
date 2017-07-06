package com.frieze.bracket.data;

/*Player class for holding player information.
Every player created is stored to PlayerData-class
Players are made by user in "addPlayerWindow"*/

public class Player {

    private static int counter = 0;
    private String name;
    private int id;
    private String tasoitus;


    public Player(String name) {
        this.name = name;
        PlayerData.getInstance().addPlayer(this);
    }


    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTasoitus() {
        return tasoitus;
    }

    public void setTasoitus(String tasoitus) {
        this.tasoitus = tasoitus;
    }

    @Override
    public String toString() {
        return name;
    }
}
