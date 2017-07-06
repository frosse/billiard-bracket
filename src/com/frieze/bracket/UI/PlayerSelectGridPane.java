package com.frieze.bracket.UI;


import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.SortedSet;

public class PlayerSelectGridPane extends GridPane {
    private Button buttonAddPlayer;
    private Button buttonMakeChart;
    private ArrayList<ComboBox> comboBoxesList;

    public PlayerSelectGridPane() {
        super();
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(10,10,10,10));
        buttonAddPlayer = new Button("Add player");
        buttonMakeChart = new Button("Make chart");
//        buttonAddPlayer.setOnAction(e ->);
//        buttonMakeChart.setOnAction(e-> );
        add(buttonAddPlayer, 2, 9);
        add(buttonMakeChart, 2, 10);

    }

    //Returns Int for row number based on how many comboboxes are already set to GridPane
    protected int setRows(int i){
        int rows = i;
        if (rows >= 24)
            rows = rows - 24;
        else {
            if (rows >= 16)
                rows = rows - 16;
            else {
                if (rows >= 8)
                    rows = rows - 8;
            }
        }
        return rows;
    }

    //Adds right amount comboboxes to pane and to correct rows.
    public void addComboboxesToPane(int i){
        int columns = 0;
        System.out.println(i);

        comboBoxesList = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            if (j == 8)
                columns = 1;
            if (j == 16)
                columns = 2;
            if (j == 24)
                columns = 3;
            ComboBox cBox = new ComboBox<>();
            comboBoxesList.add(cBox);
            add(cBox, columns, setRows(j));
        }
    }

    public ArrayList<ComboBox> getComboBoxesList() {
        return comboBoxesList;
    }
}
