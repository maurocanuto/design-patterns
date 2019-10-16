package com.canutech.builder;

public enum Profession {

    WARRIOR, THIEF, WIZARD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}