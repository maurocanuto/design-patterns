package com.canutech.decorator;

public class TeleporterRider implements Robot {

    private Robot decorated;

    public TeleporterRider(Robot decorated) {
        this.decorated = decorated;
    }

    public void attack() {
        decorated.attack();
    }

    public int getPower() {
        return decorated.getPower() + 10;
    }

    public TransportationMean escape() {
        decorated.escape();
        System.out.println("He is using its teletransportation power!");
        return TransportationMean.TELE_TRANSPORTATION;
    }
}
