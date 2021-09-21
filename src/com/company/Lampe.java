package com.company;

public class Lampe {
    private boolean onOrOff;

    public Lampe(boolean onOrOff){
        this.onOrOff = onOrOff;
    }
    public Lampe(){
        this.onOrOff = false;
    }
    public void trykPåKontakt(){
        if(onOrOff){
            onOrOff = false;
        }else{
            onOrOff = true;
        }
    }
    @Override
    public String toString() {
        return "Lampen er: " + onOrOff;
    }
}
