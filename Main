package com.a.demoruby001;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private static int finalCsExp;
    private static int finalLitExp;
    private static int finalArtExp;
    private static int finalScienceExp;
    private static int finalPhilosophyExp;
    private static int finalSocialExp;
    private static int finalHistoryExp;
    private static int finalMTExp;
    private static int finalMeTubeExp;
    private static int finalRelationshipExp;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StartView sv = new StartView();
        sv.start(primaryStage);
    }
    public static void showEnding(Stage stage, int csExp, int litExp, int artExp, int scienceExp, int philosophyExp, int socialExp, int historyExp, int mTExp, int meTubeExp, int relationshipExp) {
        finalCsExp = csExp;
        finalLitExp = litExp;
        finalArtExp = artExp;
        finalScienceExp = scienceExp;
        finalPhilosophyExp = philosophyExp;
        finalSocialExp = socialExp;
        finalHistoryExp = historyExp;
        finalMTExp = mTExp;
        finalMeTubeExp = meTubeExp;
        finalRelationshipExp = relationshipExp;

        EndingView ev = new EndingView(finalCsExp, finalLitExp, finalArtExp, finalScienceExp, finalPhilosophyExp, finalSocialExp, finalHistoryExp, finalMTExp, finalMeTubeExp, finalRelationshipExp, false); // Assuming false for enableTrueEnding initially, adjust if needed
        ev.start(stage);
    }


}
