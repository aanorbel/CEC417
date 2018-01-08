package com.aanorbel.example.bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {

    private double weight;
    private double height;

    private Scanner scanner;

    public BodyMassIndex(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.scanner = new Scanner(System.in);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        System.out.println("\nPlease Insert Weight");
        this.weight = scanner.nextDouble();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        System.out.println("\nPlease Insert Height");
        this.height = scanner.nextDouble();
    }

    public double getBodyMassIndex() {
        return this.weight / (Math.pow(this.height, 2));
    }
}
