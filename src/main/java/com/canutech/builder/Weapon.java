package com.canutech.builder;

public enum Weapon {

    DAGGER, SWORD, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}