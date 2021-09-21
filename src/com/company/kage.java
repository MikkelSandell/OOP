package com.company;

import java.util.Scanner;

public class kage {

    private double egg;
    private double sugar;
    private double cocoa;
    private double flour;
    private double bakingSoda;
    private double vanillaSugar;
    private double skimmedMilk;
    private double oilMargarine;
    private int persons;



    double getWeight(int persons) {
        this.egg = 0.16; //stk
        this.sugar = 5; //g
        this.cocoa = 12.5; //g
        this.flour = 7.5; //g
        this.bakingSoda = 2.5; //g
        this.vanillaSugar = 2.5; //g
        this.skimmedMilk = 0.416; //dl
        this.oilMargarine = 0.416; //g

        double weight = ((egg * persons * 50)
                + sugar * persons
                + cocoa * persons
                + flour * persons
                + bakingSoda * persons
                + vanillaSugar * persons
                + (skimmedMilk * persons * 30)
                + oilMargarine * persons);

        return weight;
    }
    double getWeightBaked(int persons){
        this.egg = 0.16; //stk
        this.sugar = 5; //g
        this.cocoa = 12.5; //g
        this.flour = 7.5; //g
        this.bakingSoda = 2.5; //g
        this.vanillaSugar = 2.5; //g
        this.skimmedMilk = 0.416; //dl
        this.oilMargarine = 0.416; //g

        double weight = ((egg * persons * 50)
                + sugar * persons
                + cocoa * persons
                + flour * persons
                + bakingSoda * persons
                + vanillaSugar * persons
                + (skimmedMilk * persons * 30)
                + oilMargarine * persons);
        double weightBaked = (weight/100) * 90;
        return weightBaked;

    }
    double getEnergyInCake (int persons){
        this.egg = 0.16; //stk
        this.sugar = 5; //g
        this.cocoa = 12.5; //g
        this.flour = 7.5; //g
        this.bakingSoda = 2.5; //g
        this.vanillaSugar = 2.5; //g
        this.skimmedMilk = 0.416; //dl
        this.oilMargarine = 0.416; //g
        double kj = (egg * persons * 50 * 5.8)
                + (sugar * persons * 17)
                + (cocoa * persons * 16.82)
                + (flour * persons * 14.56)
                + (bakingSoda * persons * 7.31)
                + (vanillaSugar * persons *16.4)
                + (skimmedMilk * persons * 1.46)
                + (oilMargarine * persons * 29.84);
        return kj;
    }
}