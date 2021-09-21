package com.company;

public class Main {

    public static void main(String[] args) {
        //Personopgave
        /*int alder = 23;
        String navn = "Mikkel";
        boolean birthDay = false;

        person person = new person (alder,navn,birthDay);
        System.out.println(person.toString());*/

        //Dice
        /*Dice Dice = new Dice ();
        System.out.println(Dice.toString());*/

        //lampe
        /*Lampe Lampe = new Lampe (true);
        System.out.println(Lampe.toString());*/

        //cake
        kage kage = new kage();
        System.out.printf("%.2f",kage.getWeight(4));
        System.out.print("g");
        System.out.println("");
        System.out.printf("%.2f",kage.getWeightBaked(4));
        System.out.print("g");
        System.out.println("");
        System.out.printf("%.2f",kage.getEnergyInCake(4));
        System.out.print("kj");

    }
}
