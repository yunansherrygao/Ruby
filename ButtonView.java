package com.a.demoruby001;
import javafx.scene.control.Button;


public class ButtonView extends Button{

    public ButtonView(String text) {
        super(text);
        //button style and text
        String defaultStyle = "-fx-background-color: rgba(249,233,205,0.5); -fx-font-family: 'Courier New';-fx-text-fill: #3d2814; -fx-font-size: 28px;-fx-font-weight: bold;";
        String enteredStyle = "-fx-background-color: rgba(205,165,129,0.5); -fx-font-family: 'Courier New';-fx-text-fill: #3d2814; -fx-font-size: 28px;-fx-font-weight: bold;";

        setStyle(defaultStyle);
        setOnMousePressed(e -> setStyle(enteredStyle));
        setOnMouseEntered(e -> setStyle(defaultStyle));

        //Execute after button is clicked
        setOnAction(event -> {
            System.out.println("button clicked");
        });

    }
}
