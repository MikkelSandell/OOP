package com.company;

public class person {
    private int alder;
    private String navn;
    private boolean birthDay;

    public person (int alder, String navn, boolean birthDay) {
        this.navn = navn;
        this.birthDay = birthDay;
        if (birthDay){
            this.alder = alder+1;
        }else {
            this.alder = alder;
        }
    }
    public int getAlder(){
        return alder;
    }
    public String getNavn(){
        return navn;
    }
    public String toString() {
            return navn + " " + alder;

        }
    }
