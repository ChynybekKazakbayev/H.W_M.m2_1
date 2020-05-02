package com.company;

public class Subaru_legasi extends Car {

    private int door;
    private int battery;
    private boolean motor;

    public Subaru_legasi(int door, int battery, boolean motor){
        this.door = door;
        this.battery = battery;
        this.motor = motor;
    }

    public Subaru_legasi(String rudder, int sitting, int whill, int door, int battery, boolean motor) {
        super(rudder, sitting, whill);
        this.door = door;
        this.battery = battery;
        this.motor = motor;
    }

    public Subaru_legasi(String rudder, int i2, int i1, int i, int sitting, int whill, double v) {
        super(rudder, sitting, whill);


    }

    public int getDoor() {
        return door;
    }

    public int getBattery() {
        return battery;
    }

    public boolean isMotor() {
        return motor;
    }

    public void chracteristicsCar(int door,int battery,boolean motor){
        System.out.println(door + " " + battery + " " + motor);
    }

    public void characteristicsCar(int battery, int door, boolean motor){

    }

    public final void characteristicsCar(boolean motor,int battery, int door){

    }
}
