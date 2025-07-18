package com.kienminh.bmi.core;

public class BmiCalculator {
    public static double getBmi(double height, double weight) {
        return weight / (height * height);
    }
}
