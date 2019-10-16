package com.canutech.builder;

public enum Armor {

    CLOTHES("clothes"), LEATHER("leather");

    private String title;

    Armor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}