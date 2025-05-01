package com.a.demoruby001;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.List;
import java.util.Arrays;


public class EndingView extends Application {

    private int csExp;
    private int litExp;
    private int artExp;
    private int scienceExp;
    private int philosophyExp;
    private int socialExp;
    private int historyExp;
    private int mTExp;
    private int meTubeExp;
    private int relationshipExp;

    private int gamingExp = 0;
    private int speechExp = 0;
    private boolean enableTrueEnding;

    private Label titleLabel;
    private Label dialogueLabel;


    private List<String> trueEndingSegments;
    private int currentTrueEndingSegment = 0;
    private AnchorPane root; // Make root accessible for click handling

    //Constructoer acceping datas in the main class
    public EndingView(int csExp, int litExp, int artExp, int scienceExp, int philosophyExp, int socialExp, int historyExp, int mTExp, int meTubeExp, int relationshipExp, boolean enableTrueEnding) {
        this.csExp = csExp;
        this.litExp = litExp;
        this.artExp = artExp;
        this.scienceExp = scienceExp;
        this.philosophyExp = philosophyExp;
        this.socialExp = socialExp;
        this.historyExp = historyExp;
        this.mTExp = mTExp;
        this.meTubeExp = meTubeExp;
        this.relationshipExp = relationshipExp;
        this.enableTrueEnding = enableTrueEnding; // Set the switch based on game state
        initializeTrueEndingSegments(); // Initialize segments
    }

    // Testing case constructor
    public EndingView() {
        this.csExp = 30;
        this.litExp = 5;
        this.artExp = 0;
        this.scienceExp = 0;
        this.philosophyExp = 0;
        this.socialExp = 0;
        this.historyExp = 0;
        this.mTExp = 0;
        this.meTubeExp = 15;
        this.relationshipExp = 0;
        this.enableTrueEnding = false;
        initializeTrueEndingSegments();
    }

    private void initializeTrueEndingSegments() {
        trueEndingSegments = Arrays.asList(
                "The life goes too fast, faster than I thought.\nFaster than I can even realized she grown up,\nshe got old, and she left.", // Segment 0
                "What... should she even get older?\nShe is a robot.",
                "But her hair, her skin, her laughter, was so real.\nI am forgetting some important information...",
                "Help...\nWe are trapped here."
        );
    }


    @Override
    public void start(Stage stage) {
        root = new AnchorPane();
        root.setBackground(createBackground("/Home1.jpg"));

        titleLabel = new Label();
        titleLabel.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 36px; -fx-text-fill: white; -fx-font-weight: bold;");
        titleLabel.setTextAlignment(TextAlignment.CENTER);

        dialogueLabel = new Label();
        dialogueLabel.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 28px; -fx-text-fill: white; -fx-font-weight: normal; -fx-background-color: rgba(0, 0, 0, 0.5); -fx-padding: 15px;");
        dialogueLabel.setWrapText(true);
        dialogueLabel.setAlignment(Pos.TOP_LEFT);


        // true ending value calculation logic
        if (enableTrueEnding) {
            showTrueEnding();
            root.setOnMouseClicked(this::handleTrueEndingClick);
        } else {
            showNormalEnding();
            root.setOnMouseClicked(null);
        }

        VBox layoutBox = new VBox(30);
        layoutBox.getChildren().addAll(titleLabel, dialogueLabel);
        layoutBox.setAlignment(Pos.CENTER);
        layoutBox.setPadding(new Insets(50));

        layoutBox.setPickOnBounds(false);

        AnchorPane.setTopAnchor(layoutBox, 0.0);
        AnchorPane.setBottomAnchor(layoutBox, 0.0);
        AnchorPane.setLeftAnchor(layoutBox, 0.0);
        AnchorPane.setRightAnchor(layoutBox, 0.0);

        root.getChildren().add(layoutBox);

        Scene scene = new Scene(root, 1400, 800);
        stage.setScene(scene);
        stage.setTitle("Ending");
        stage.show();
    }

    private void showTrueEnding() {
        titleLabel.setText("True Ending");
        currentTrueEndingSegment = 0;
        if (!trueEndingSegments.isEmpty()) {
            dialogueLabel.setText(trueEndingSegments.get(currentTrueEndingSegment));
        } else {
            dialogueLabel.setText("Error: True ending segments not loaded.");
        }
    }

    private void handleTrueEndingClick(MouseEvent event) {
        currentTrueEndingSegment++;
        if (currentTrueEndingSegment < trueEndingSegments.size()) {
            dialogueLabel.setText(trueEndingSegments.get(currentTrueEndingSegment));
        } else {
            root.setOnMouseClicked(null);
            System.out.println("End of true ending segments.");
        }
    }

    private void showNormalEnding() {
        titleLabel.setText("Years later…");
        String endingDialogue = "";

        // Value ending logic calculation
        if (csExp > 25) {
            endingDialogue = "AI Engineer\n\n" +
                    "Ruby followed in my footsteps and became an AI engineer.\n" +
                    "I’m proud of her—yet deep down, I’ve always been a little worried…\n\n" +
                    "– End: AI Engineer –";
        } else if (csExp > 8 && gamingExp > 7 && meTubeExp > 10) {
            endingDialogue = "MeTuber\n\n" +
                    "“Tonight’s special guest on the stream is… my sister!”\n" +
                    "Even after work, I still end up on Ruby’s livestream.\n" +
                    "It’s painful… and yet kind of fun.\n\n" +
                    "– End: MeTuber –";
        } else if (litExp > 25) {
            endingDialogue = "Writer\n\n" +
                    "With what she learned in literature class,\n" +
                    "Ruby wrote stories as soulful and moving as any human’s.\n\n" +
                    "– End: Writer –";
        } else if (litExp > 15 && speechExp > 15) {
            endingDialogue = "Politician\n\n" +
                    "Ruby’s had enough of that president for a long time.\n" +
                    "Now it’s her turn to bring hope to the people.\n\n" +
                    "– End: Politician –";
        } else if (artExp > 20) {
            endingDialogue = "Illustrator\n\n" +
                    "When I came home, I saw Ruby still drawing for a children’s picture book.\n" +
                    "The warm orange light shone on her red hair…\n" +
                    "Just like the peaceful life I had dreamed of all along.\n\n" +
                    "– End: Illustrator –";
        } else if (artExp > 25) {
            endingDialogue = "Artist\n\n" +
                    "In the end, Ruby chose to live among oil paints.\n" +
                    "There’s something in her brushstrokes that speaks directly to the heart.\n\n" +
                    "– End: Artist –";
        } else if (mTExp > 15) {
            endingDialogue = "Day Trader\n\n" +
                    "The little girl finally put on a suit.\n" +
                    "At least, as a robot, she didn’t need to chug coffee while waiting for the market to open.\n\n" +
                    "– End: Day Trader –";
        } else if (mTExp > 20) {
            endingDialogue = "Freelance Investor\n\n" +
                    "Do investors really need that many monitors?\n" +
                    "When she brought me to her room,\n" +
                    "I was absolutely shocked by the wall full of screens tracking stock trends.\n\n" +
                    "– End: Freelance Investor –";
        } else if (scienceExp > 20) {
            endingDialogue = "Research Assistant\n\n" +
                    "PCR, western blot, taking care of lab rats…\n" +
                    "These repetitive tasks became Ruby’s daily life.\n" +
                    "But somehow, that repetition gave her peace.\n\n" +
                    "– End: Research Assistant –";
        } else if (scienceExp > 25) {
            endingDialogue = "Doctor\n\n" +
                    "I’m certain—this robot girl in a white coat,\n" +
                    "when saving lives, loves no less than any human ever could.\n\n" +
                    "– End: Doctor –";
        } else if (scienceExp > 15 && csExp > 15) {
            endingDialogue = "Scientist\n\n" +
                    "Ruby eventually formed her own research team.\n" +
                    "Their goal: curing cancer.\n" +
                    "I hope to see you at the Royal Swedish Academy of Sciences someday.\n\n" +
                    "– End: Scientist –";
        } else if (philosophyExp > 15 && speechExp > 15) {
            endingDialogue = "Attorney\n\n" +
                    "“Objection!”\n" +
                    "…Ruby, doesn’t it hurt when you slam your hand on the table like that?\n\n" +
                    "– End: Attorney –";
        } else if (philosophyExp > 25) {
            endingDialogue = "Philosopher\n\n" +
                    "Ruby eventually became a scholar.\n" +
                    "But she still couldn’t stand reading Sartre.\n" +
                    "No, not just dislike—it’s more like… fear.\n\n" +
                    "– End: Philosopher –";
        } else {
            // Default Ending: Normal Person
            endingDialogue = "Normal Person\n\n" +
                    "Ruby lived a simple life, just like anyone else in this world.\n" +
                    "But that’s all I could ever wish for:\n" +
                    "That she lives a quiet, happy life—\n" +
                    "and remains the same little sister who always gave me that big, bright smile.\n\n" +
                    "– End: Normal People –";
        }

        dialogueLabel.setText(endingDialogue);
    }

    public Background createBackground(String imagePath) {
        try {
            Image bg = new Image(getClass().getResource(imagePath).toExternalForm());
            BackgroundImage background = new BackgroundImage(
                    bg,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
            return new Background(background);
        } catch (NullPointerException e) {
            System.err.println("Error loading background image: " + imagePath);
            return new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
