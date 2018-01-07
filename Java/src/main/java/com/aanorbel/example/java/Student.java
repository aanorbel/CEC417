package com.aanorbel.example.java;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> quizzes;

    public Student(String name) {
        this.name = name;
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

    public void addQuiz(int quiz) {
        this.quizzes.add(quiz);
    }

    /**
     * provides an average of all the current scores for the quiz
     *
     * @return average  score
     */
    public double getAverageScore() {

        double total = quizzes.stream()
                .mapToDouble(quiz -> quiz)
                .sum();

        return total / quizzes.size();
    }

    /**
     * sums all the marks of the quiz
     *
     * @return total
     */
    public double getTotalScore() {

        return quizzes.stream().mapToDouble(quiz -> quiz).sum();

    }
}
