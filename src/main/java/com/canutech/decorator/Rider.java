package com.canutech.decorator;

public class Rider implements Robot {

    public void attack() {
        System.out.println("-----------------");
        System.out.println("The rider tries to attack you!");
    }

    public int getPower() {
        return 10;
    }

    public TransportationMean escape() {
        System.out.println("-----------------");
        System.out.println("The rider is running away! ");
        return TransportationMean.MOTO;
    }
}
