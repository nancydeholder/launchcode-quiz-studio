package org.launchcode;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private int totalPoints = 0;
    private int score = 0;
    private String name;

    public Quiz (String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void addQuestion(Question q) {
        totalPoints += q.getPoints();
        questions.add(q);
    }

    public void takeQuiz() {
        System.out.println(name);
        System.out.println("=================");
        for (Question question : questions) {
            score += question.runQuestion();
        }
    }

}
