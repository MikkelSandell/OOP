package com.company;

import java.util.Random;

public class Dice {
    Random randomGenerator = new Random();
    private int roll;
    private int faceValue = roll();
    public int roll(){
        int roll = randomGenerator.nextInt(6) + 1;
        return roll;
    }
    public String toString() {
        return "Dice = " + faceValue;
    }
}
