package com.a.demoruby001;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class TextEffect {

    public static void showEffectText(Label label, String Text, Duration delayBetweenChars) {
        final StringBuilder currentText = new StringBuilder();
        Timeline timeline = new Timeline();

        for (int i = 0; i < Text.length(); i++) {
            final int index = i;
            KeyFrame keyFrame = new KeyFrame(delayBetweenChars.multiply(i), e -> {
                currentText.append(Text.charAt(index));
                label.setText(currentText.toString());
            });
            timeline.getKeyFrames().add(keyFrame);
        }

        timeline.play();
    }
}
