package org.launchcode;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class TrueFalseQuestion extends MultipleChoiceQuestion {

    public TrueFalseQuestion (String text, boolean answer) {
        super(text);

        choices = new ArrayList<>();
        choices.add("False");
        choices.add("True");

        if (answer) {
            correctChoices.add(1);
        } else {
            correctChoices.add(0);
        }
    }

}
