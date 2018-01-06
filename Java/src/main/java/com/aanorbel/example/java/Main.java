package com.aanorbel.example.java;

public class Main {

    public static void main(String[] args) {

        Student me = new Student();
        me.setName("Me");
        me.addQuiz(new Quiz("first",32));
        me.addQuiz(new Quiz("second",34));
        me.addQuiz(new Quiz("third",35));

        me.getQuizzes()
                .forEach(System.out::println);

        System.out.println(me.getAverageScore());
    }
}
