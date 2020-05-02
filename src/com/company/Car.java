package com.company;

public class Car {
    private String rudder;
    private int sitting;
    private int whill;

    public Car(){}

    public Car(String rudder, int sitting, int whill) {
        this.rudder = rudder;
        this.sitting = sitting;
        this.whill = whill;
    }

    public String getRudder() {
        return rudder;
    }

    public int getSitting() {
        return sitting;
    }

    public int getWhill() {
        return whill;
    }

    public String characteristicsCar(){

        return "Mashina sostoit iz " + rudder + sitting + whill;

    }

    public void info(){
        System.out.println("mawinu vodit chelovek");

    }

    public void signal(){
        System.out.println("bi-bip");
    }
}


