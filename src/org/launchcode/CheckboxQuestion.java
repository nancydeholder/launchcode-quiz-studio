package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by LaunchCode
 */
public class CheckboxQuestion extends Question {

    protected ArrayList<String> choices;
    protected ArrayList<Integer> correctChoices;
    private String answerPrompt = "Enter all correct answers, separated by commas:";

    public CheckboxQuestion(String text, ArrayList<String> choices, ArrayList<Integer> correctChoices) {
        super(text);
        this.choices = choices;
        this.correctChoices = correctChoices;
    }

    public CheckboxQuestion(String text) {
        super(text);
        this.choices = new ArrayList<>();
        this.correctChoices = new ArrayList<>();
    }

    public String getAnswerPrompt() {
        return answerPrompt;
    }

    public void setAnswerPrompt(String answerPrompt) {
        this.answerPrompt = answerPrompt;
    }

    @Override
    public int runQuestion() {
        System.out.println(this);

        String answerStr = userInput.nextLine();
        String[] answerStrs = answerStr.split(",");
        ArrayList<Integer> userChoices = new ArrayList<>();

        for (int i = 0; i < answerStrs.length; i++) {
            userChoices.add(Integer.parseInt(answerStrs[i].trim()));
        }

        Collections.sort(userChoices);
        Collections.sort(correctChoices);

        if (userChoices.equals(correctChoices)) {
            return points;
        }

        return 0;
    }

    public String toString() {
        String questionStr = text + "\n";
        for (int i = 0; i < choices.size(); i++) {
            questionStr += (i + " - " + choices.get(i) + "\n");
        }

        questionStr += answerPrompt;

        return questionStr;
    }
}
