package com.company;

public class Lampe {
    private boolean onOrOff;
    private static int Count;
    private int trykCount;
    private String Tilstand;

    public Lampe(boolean onOrOff){
        this.onOrOff = onOrOff;
        this.Count++;
    }
    public Lampe(){
        this.Count++;
        this.onOrOff = false;
        Tilstand= "Slukket";
    }

    public int getCount() {
        return Count;
    }

    public void trykPåKontakt(){
        trykCount++;
        if(onOrOff){
            onOrOff = false;
            Tilstand= "Slukket";
        }else{
            onOrOff = true;
            Tilstand = "tændt";
        }

    }
    @Override
    public String toString() {
        return "Lampen er: " + onOrOff + "/" + Tilstand + " der er tykket på knappen " + trykCount;
    }
}
