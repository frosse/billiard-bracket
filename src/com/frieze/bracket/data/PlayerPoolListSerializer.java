package com.frieze.bracket.data;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class PlayerPoolListSerializer implements Serializable{

    public PlayerPoolListSerializer(){}

    public void serializePlayerList(ArrayList<ArrayList<Player>> playerLists){

        try {
            ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream(
                    ".\\out\\production\\Bracketv3\\com\\frosse\\playerLists.ser"));
            playerLists = (ArrayList<ArrayList<Player>>) inputStream.readObject();
            if(playerLists == null) playerLists = new ArrayList<>();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
