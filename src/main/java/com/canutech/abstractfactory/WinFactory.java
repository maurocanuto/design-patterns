package com.canutech.abstractfactory;

public class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}
