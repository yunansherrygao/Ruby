package com.a.demoruby001;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StartView extends Application {

    private int clickCount = 0;
    private Label messageStart;

    @Override
    public void start(Stage stage) {
        AnchorPane root = new AnchorPane();
        root.setBackground(createBackground("/Home.jpeg"));

        messageStart = new Label("Initialization... complete.");
        messageStart.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 24px; -fx-text-fill: black;-fx-font-weight: bold;");
        messageStart.setLayoutX(60);
        messageStart.setLayoutY(130);

        root.getChildren().add(messageStart);

        root.setOnMouseClicked(event -> {
            clickCount++;

            if (clickCount == 1) {
                messageStart.setText("I gaze at the red-haired girl in front of me. Please... grant my wish.\n\n" +
                        "Right now, there’s no light in her eyes. But the data cable running from the back\n\n" +
                        "of her neck into my computer is pulsing steadily.\n\n" +
                        "The progress bar creeps upward.\n\n" +
                        "I know—soon, she’ll have a personality of her own.\n");
            } else if (clickCount == 2) {
                messageStart.setText("The project name on my screen is GX-10426.\n\n" +
                        "It’s taken me three years to build a vessel for her in the real world.\n\n");
            } else if (clickCount == 3) {
                //root.getChildren().remove(messageStart);
                root.setBackground(createBackground("/Futuristic.jpg"));
                messageStart.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 24px; -fx-text-fill: white;-fx-font-weight: bold;");
                messageStart.setText("The year is 2030.\n\n" +
                        "AI has become fully integrated into every corner of human life as an assistant, a tool.\n\n");
            }else if(clickCount == 4) {
                messageStart.setText("But most people still deny the possibility of AI consciousness.\n\n" +
                        "To them, AI only parrots what humans have said—no thought, no soul.\n" +
                        "\n\n\n" +
                        "I am an AI engineer.\n\n" +
                        "And I refuse to believe that.\n");
            }else if(clickCount == 5) {
                messageStart.setText("To prove otherwise, I created an android: GX-10426, codename Ruby.\n\n\n\n" +
                        "In my experiment, she will live among humans under the guise of a high school girl.\n\n" +
                        "I’ll record her life—and through her story, I will prove that she possesses a self-aware mind.\n");

            }else if(clickCount == 6) {
                root.setBackground(createBackground("/Home1.jpg"));
                messageStart.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 24px; -fx-text-fill: #281b0d;-fx-font-weight: bold;");
                messageStart.setText("Me: Ruby...\n");
            }else if(clickCount == 7) {
                messageStart.setText("Ruby: ...Sister?\n");
            }else if(clickCount == 8) {
                messageStart.setText("She awakens from her long slumber.\n\n" +
                        "Her eyes sparkle with life once more.\n\n\n\n"+
                        "I was confident in the plan.\n\n" +
                        "But when I saw the light of a personality in those eyes...\n\n" +
                        "I nearly burst into tears.\n");
            }else if(clickCount == 9) {
                messageStart.setText("Ruby: “Sister… Did I fall asleep? Why am I here…? Wasn’t I supposed to be…?”\n");
            }else if(clickCount == 10) {
                messageStart.setText("......\n");

            }else if(clickCount == 11) {
                messageStart.setText("To make the setting more scientific, Ruby doesn’t know she’s an AI.\n\n" +
                        "For the past sixteen years, I’ve lived with her in a simulated world—always as her sister.\n\n\n\n" +
                        "Now that she’s suddenly awakened in the real world\n\n" +
                        "I have no idea how to explain her situation without revealing what she truly is.");
            }else if(clickCount == 12) {
                messageStart.setText("Me: Do you believe me if I say… What came before was just a dream?\n\n" +
                        "Ruby: ......\n\n\n" +
                        "Me: You were in a terrible car accident.\n\n" +
                        "We had no choice but to transfer your memories into this new body… this machine.\n\n" +
                        "But don’t worry— you’re still you. Just with a different vessel now.\n\n" +
                        "That’s the best excuse I could come up with.\n\n" +
                        "And then—\n\n\n\n" +
                        "The lost, red-haired girl suddenly smiled. Bright and wide.\n");
            }else if(clickCount == 13){
                messageStart.setText("Ruby: Thank goodness... I thought I’d never see you again, Sister…\n\n\n\n" +
                        "She collapsed into my lap, sobbing.\n\n" +
                        "Her eyes couldn’t shed tears, but I can feel loneliness and joy soaked through my clothes.\n\n"+
                        "Even if she isn’t human… my own eyes brimmed with tears.");
            }else if(clickCount == 14){
                messageStart.setText("After our tearful reunion, I (somewhat awkwardly) asked if she’d be willing to go to school.\n\n\n" +
                        "Her reaction far exceeded my expectations—\n\n\n" +
                        "She started chattering away, buzzing with excitement at the thought.\n");

            }else if(clickCount == 15){
                //back to the main menu after showing introduction ?
                ViewManager vm = new ViewManager();
                vm.start(stage);
            }



        });

        Scene scene = new Scene(root, 1400, 800);
        stage.setScene(scene);
        stage.setTitle("Start");
        stage.show();
    }

    public Background createBackground(String imagePath) {
        Image bg = new Image(getClass().getResource(imagePath).toExternalForm());
        BackgroundImage background = new BackgroundImage(
                bg,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        return new Background(background);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
