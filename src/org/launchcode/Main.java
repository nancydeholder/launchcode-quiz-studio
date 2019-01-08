package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Quiz quiz = new Quiz("Java Quiz");

        Question q1 = new TrueFalseQuestion("Java is the same as Javascript", false);
        quiz.addQuestion(q1);

        ArrayList<String> q2choices = new ArrayList<>();
        q2choices.add("Capital (or Pascal) Case");
        q2choices.add("Camel Case");
        q2choices.add("All lowercase");
        Question q2 = new MultipleChoiceQuestion("In Java, instance variable naming conventions use:", q2choices, 1);
        quiz.addQuestion(q2);

        ArrayList<String> q3choices = new ArrayList<>();
        q3choices.add("All variables must have a declared type");
        q3choices.add("Java was invented by Lewis and Clark as a way to pass time during their expedition");
        q3choices.add("The word Java has 4 letters");
        ArrayList<Integer> q3CorrectChoices = new ArrayList<>();
        q3CorrectChoices.add(0);
        q3CorrectChoices.add(2);
        Question q3 = new CheckboxQuestion("Which of the following statements are true of Java", q3choices, q3CorrectChoices);
        quiz.addQuestion(q3);

        quiz.takeQuiz();
        System.out.println("Score: " + quiz.getScore() + " / " + quiz.getTotalPoints());
    }
}
