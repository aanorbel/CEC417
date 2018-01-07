package com.aanorbel.example.java;

public class StudentTester {

    public static void main(String[] args) {

        Student me = new Student("Me");
        me.addQuiz(32);
        me.addQuiz(34);
        me.addQuiz(35);

        System.out.println("Scores");
        me.getQuizzes()
                .forEach(System.out::println);

        System.out.println("\nTotal Score : " + me.getTotalScore());

        System.out.println("Average Score : " + me.getAverageScore());
    }
}
