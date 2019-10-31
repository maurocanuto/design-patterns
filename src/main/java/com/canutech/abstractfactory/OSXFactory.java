package com.canutech.abstractfactory;

public class OSXFactory implements GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }
}
