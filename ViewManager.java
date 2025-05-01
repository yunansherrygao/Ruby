package com.a.demoruby001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BackgroundPosition;
import javafx.stage.Stage;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.List;
import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.util.Duration;

import javafx.scene.control.Button;




public class ViewManager extends Application {
    private int clickCount = 0;
    private Label HOW_TO_PLAY;
    private Label HOW_TO_PLAY1;
    private Label CHOOSE_EVENT;
    private int trackTurn = 0;
    private Label TEST1;
    AnchorPane root = new AnchorPane();

    private int csExp = 0;
    private int litExp = 0;
    private int artExp = 0;
    private int scienceExp = 0;
    private int philosophyExp = 0;
    private int socialExp = 0; // For "Hang Out" and "Play"
    private int historyExp = 0;
    private int mTExp = 0;
    private int meTubeExp = 0;
    private int relationshipExp = 0;

    private Stage primaryStage;

    //button starts here
    private final static int MENU_START_BUTTON = 200;
    private final static int MENU_STOP_BUTTON = 200;
    List<ButtonView> menuButton;


    public ViewManager() {
        menuButton = new ArrayList<>();
        root.setBackground(createBackground("/Home1.jpg"));
    }

    @Override
    public void start(Stage stage) {

        this.primaryStage = stage;

        TEST1 = new Label();
        TEST1.setStyle("-fx-font-family: 'Courier New';-fx-font-size: 24px; -fx-text-fill: #281b0d; -fx-font-weight: bold;");
        TEST1.setLayoutX(100);
        TEST1.setLayoutY(100);
        TEST1.setVisible(false);

        TextEffect.showEffectText(TEST1, "Test...", Duration.millis(100));

        HOW_TO_PLAY = new Label();
        HOW_TO_PLAY.setStyle("-fx-font-family: 'Courier New';-fx-font-size: 24px; -fx-text-fill: #281b0d; -fx-font-weight: bold;");
        HOW_TO_PLAY.setLayoutX(100);
        HOW_TO_PLAY.setLayoutY(100);
        root.getChildren().add(HOW_TO_PLAY);
        TextEffect.showEffectText(HOW_TO_PLAY, "Choose a field...", Duration.millis(100));

        HOW_TO_PLAY1 = new Label();
        HOW_TO_PLAY1.setStyle("-fx-font-family: 'Courier New';-fx-font-size: 24px; -fx-text-fill: #281b0d; -fx-font-weight: bold;");
        HOW_TO_PLAY1.setLayoutX(100);
        HOW_TO_PLAY1.setLayoutY(200);
        HOW_TO_PLAY1.setVisible(false);
        root.getChildren().add(HOW_TO_PLAY1);
        setMouseClick();

        //size of the anchorpane
        Scene scene = new Scene(root, 1400, 800);
        this.primaryStage.setScene(scene); // Use the stored stage
        this.primaryStage.setTitle("Main Menu");
        this.primaryStage.show();
    }

    public void showMenuButtonsPage() {
        root.getChildren().clear();
        root.setBackground(createBackground("/Home1.jpg"));

        //track record
        Label TRACK_TIME = new Label();
        TRACK_TIME.setStyle("-fx-font-family: 'Courier New';-fx-font-size: 22px; -fx-text-fill: #FF69B4; -fx-font-weight: bold;");
        TRACK_TIME.setLayoutX(180);
        TRACK_TIME.setLayoutY(100);
        //TRACK_TIME.setVisible(false);
        root.getChildren().add(TRACK_TIME);
        TextEffect.showEffectText(TRACK_TIME, "Track " + (trackTurn + 1) + " / 36", Duration.millis(100));

        CHOOSE_EVENT = new Label();
        CHOOSE_EVENT.setStyle("-fx-font-family: 'Courier New';-fx-font-size: 30px; -fx-text-fill: #281b0d; -fx-font-weight: bold;");
        CHOOSE_EVENT.setLayoutX(500);
        CHOOSE_EVENT.setLayoutY(100);
        root.getChildren().add(CHOOSE_EVENT);
        TextEffect.showEffectText(CHOOSE_EVENT, "What Should Ruby do this month?", Duration.millis(100));

        addmenuButton();
    }


    public void createmenuButton(ButtonView button, int col, int row) {
        int prefWid = 100;
        int prefHei = 20;

        int cGap = 200;
        int rGap = 200;

        button.setLayoutX(MENU_START_BUTTON + col * (prefWid + cGap));
        button.setLayoutY(MENU_STOP_BUTTON + row * (prefHei + rGap));
        menuButton.add(button);
        root.getChildren().add(button);


    }

    public Background createBackground(String imagePath) {
        Image bg1 = new Image(getClass().getResource(imagePath).toExternalForm());
        BackgroundImage background1 = new BackgroundImage(
                bg1,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        return new Background(background1);
    }

public void addmenuButton() {
    String[] menuText = {"CS", "Literature", "Art", "Science", "Philosophy", "History Museum", "Market Trading", "MeTube", "Hang Out", "Play"};
    int buttonsPerRow = 4; // How many buttons per row

    for (int i = 0; i < menuText.length; i++) {
        ButtonView button1 = new ButtonView(menuText[i]);
        int col = i % buttonsPerRow;
        int row = i / buttonsPerRow;
        createmenuButton(button1, col, row);


        final String activityName = menuText[i];
        button1.setOnAction(event -> handleActivitySelection(activityName));
    }
}

    private void handleActivitySelection(String activityName) {
        String bgPath = "";
        String description = "";
        boolean activitySelected = true;

        switch (activityName) {
            case "CS":
                bgPath = "/CS.jpg";
                description = "Ruby spent a whole class debugging the code.";
                csExp++;
                break;
            case "Literature":
                bgPath = "/Literature.jpg";
                description = "Reading Shakespeare helps Ruby understand\n\n" +
                        "the complexities of human emotions.";
                litExp++;
                break;
            case "Art":
                bgPath = "/Art.jpg";
                description = "Ruby tries oil painting,\n\n" +
                        "only to find paint on her nose.";
                artExp++;
                break;
            case "Science":
                bgPath = "/Science.jpg";
                description = "Ruby’s E. coli culture gets\n\n" +
                        "contaminated by yeast— again.";
                scienceExp++;
                break;
            case "Philosophy":
                bgPath = "/Philosophy.jpg";
                description = "God is dead.\n\n" +
                        "   Wait, what is dead?";
                philosophyExp++;
                break;
            case "History Museum":
                bgPath = "/History.jpg";
                description = "Ruby explains the Stone Age,\n\n" +
                        "the Bronze Age, the Iron Age…\n\n" +
                        "Seriously, how slow were these humans?";
                historyExp++;
                break;
            case "Market Trading":
                bgPath = "/MarketTrading.jpg";
                description = "Even the latest AI models failed to foresee\n\n" +
                        "the wisdom of Mr.President’s choices.";
                mTExp++;
                break;
            case "MeTube":
                bgPath = "/MeTube.jpg";
                description = "Neuron-chan’s live is always interesting,\n\n" +
                        "maybe Ruby can also try so…?";
                meTubeExp++;
                break;
            case "Hang Out":
                bgPath = "/HangOut.jpg";
                description = "Went to Shinmura— \n\n" +
                        "every skirt at 901 was just too cute.";
                socialExp++;
                relationshipExp++;
                break;
            case "Play":
                bgPath = "/Play.jpg";
                description = "We didn’t go to Hokkaido,\n\n" +
                        "but Skiing together was just as fun.";
                socialExp++;
                relationshipExp++;
                break;
            default:
                activitySelected = false;
                break;
        }

        if (activitySelected) {
            trackTurn++;
            showActivity(bgPath, description);
            checkGameEnd();
        }
    }

    public void checkGameEnd() {
        // Check if the game should end (use < 36 for turns 1-36)
        if (trackTurn >= 36) {
            endGame();
        }
    }

    public void endGame() {
        if (this.primaryStage != null) {
            Main.showEnding(this.primaryStage, csExp, litExp, artExp, scienceExp, philosophyExp, socialExp, historyExp, mTExp, meTubeExp, relationshipExp);
        } else {
            System.err.println("Error: Primary stage is null. Cannot show ending view.");
        }
    }

public void setMouseClick() {
    clickCount = 0;
    root.setOnMouseClicked(event -> {
        clickCount++;
        if (clickCount == 1) {
            HOW_TO_PLAY1.setText("The expected experiment period is 12 months.\n\n" +
                    "Each month, I can help Ruby to take three actions.\n\n" +
                    "Classes and activities will help increase her career-related stats,\n\n" +
                    "Hanging out together or playing games should deepen the bond between us."
            );
            HOW_TO_PLAY1.setVisible(true);
        } else if (clickCount == 2) {
            showMenuButtonsPage();
        }
    });
}

public void showActivity(String bgPath, String descriptionText) {
    root.getChildren().clear();
    root.setBackground(createBackground(bgPath));

    Label desc = new Label(descriptionText);
    desc.setLayoutX(300);
    desc.setLayoutY(300);
    desc.setStyle("-fx-font-family: 'Courier New';-fx-font-size: 38px; -fx-text-fill: white;-fx-font-weight: bold;");
    root.getChildren().add(desc);

    root.setOnMouseClicked(null);

    Button continueButton = new Button("Continue");
    continueButton.setStyle("-fx-background-color: rgba(249,233,205,0.7); -fx-font-family: 'Courier New';-fx-text-fill: #3d2814; -fx-font-size: 28px;-fx-font-weight: bold;");
    continueButton.setLayoutX(650);
    continueButton.setLayoutY(700);
    root.getChildren().add(continueButton);

    continueButton.setOnAction(e -> {
        if (trackTurn < 36) {
            showMenuButtonsPage();
        }
    });
}


}
