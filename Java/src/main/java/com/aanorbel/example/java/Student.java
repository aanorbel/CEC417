package com.aanorbel.example.java;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Quiz> quizzes;

    public Student() {
        quizzes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void addQuiz(Quiz quiz) {
        this.quizzes.add(quiz);
    }

    public double getAverageScore() {

        double total = 0;

        for (Quiz quiz : quizzes) {
            total += quiz.getScore();
        }

        return total / quizzes.size();
    }
}
