package org.launchcode;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class MultipleChoiceQuestion extends CheckboxQuestion {

    public MultipleChoiceQuestion(String text, ArrayList<String> choices, int correctChoice) {
        super(text);
        this.choices = choices;
        this.correctChoices.add(correctChoice);
        setAnswerPrompt("Enter the correct answer:\n");
    }

    protected MultipleChoiceQuestion(String text) {
        super(text);
        setAnswerPrompt("Enter the correct answer:\n");
    }

}
