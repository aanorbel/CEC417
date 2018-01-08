package com.aanorbel.example.bodymassindex;


public class BodyMassIndexTest {

    public static void main(String[] args) {

        System.out.println("Body Mass Index Program ");

        BodyMassIndex me = new BodyMassIndex(12, 12);
        System.out.println("Default BMI : "+me.getBodyMassIndex());

        me.setHeight();
        me.setWeight();

        System.out.println("\nBMI with setters : "+me.getBodyMassIndex());

    }
}
