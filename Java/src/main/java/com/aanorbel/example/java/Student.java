package com.aanorbel.example.java;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> quizzes;

    public Student() {
        quizzes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getQuizzes() {
        return quizzes;
    }

    public void addQuiz(Integer quiz) {
        this.quizzes.add(quiz);
    }

    public double getAverageScore() {

        double total = 0;

        for (Integer quiz : quizzes) {
            total += quiz;
        }

        return total / quizzes.size();
    }
}
