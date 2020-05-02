package com.company;

public class Forestor extends Car {
    private int window;

    public Forestor(String rudder, int sitting, int whill, int window) {
        super(rudder, sitting, whill);
        this.window = window;
    }


    public int getWindow() {
        return window;
    }

    public Forestor(String rudder, int sitting, int whill) {
        super(rudder, sitting, whill);

    }
    @Override
    public void signal(){
        super.signal();
        System.out.println("kach joldon");

    }
}
