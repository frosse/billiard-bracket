package com.frieze.bracket.UI;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ScoreboxUI {

    private Rectangle baseRectangle;
    private StackPane scorePane = new StackPane();
    private GridPane smallGrid = new GridPane();
    private Label player1Label = new Label();
    private Label player2Label = new Label();
    private TextField score1TF = new TextField();
    private TextField score2TF = new TextField();

    public ScoreboxUI(){

        addColorsToRectangle();
        setTextAndSizeToLabels();
    }

    public void addColorsToRectangle() {
        baseRectangle = new Rectangle(150, 60, Color.DARKGREY);
        baseRectangle.setEffect(new DropShadow(5, 1, 1, Color.BLACK));
    }

    public void setTextAndSizeToLabels(){
        player1Label.setPrefWidth(100);
        player2Label.setPrefWidth(100);
        player1Label.setText("Player");
        player2Label.setText("Player");
    }

}
