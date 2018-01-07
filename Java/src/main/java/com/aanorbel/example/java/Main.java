package com.aanorbel.example.java;

public class Main {

    public static void main(String[] args) {

        Student me = new Student();
        me.setName("Me");
        me.addQuiz(32);
        me.addQuiz(34);
        me.addQuiz(35);

        me.getQuizzes()
                .forEach(System.out::println);

        System.out.println(me.getAverageScore());
    }
}
