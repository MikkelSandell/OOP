package com.company;

public class kage {

    private double egg = 2;
    private double sugar = 300;
    private double cocoa = 6;
    private double flour = 250;
    private double bakingSoda = 1;
    private double vanillaSugar = 30;
    private double skimmedMilk = 5;
    private double oilMargarine = 5;
    private int persons;

    public double getNumberOfEggs() {
        return egg;
    }

    public double getGramsOfSugar() {
        return sugar;
    }

    public double getGramsOfCocoa(){
        return cocoa;
    }

    public double getGramsOfFlour(){
        return flour;
    }
    public double getTblspBakingPowder() {
        return bakingSoda;
    }
    public double getGramsOfVanillaSugar() {
        return vanillaSugar;
    }
    public double getDeciliterOfskimmedMilk() {
        return skimmedMilk;
    }
    public double getGramsOfOilMargarine(){
        return oilMargarine;
    }

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