package com.canutech.chainofresponsibility;

public class Officer extends ActionHandler {

    public Officer(ActionHandler next) {
        super(next);
    }

    @Override
    public void handleAction(Action action) {
        if (ActionType.STEAL.equals(action.getActionType())) {
            printHandling(action);
            action.setDone();
        } else {
            super.handleAction(action);
        }
    }

    @Override
    public String toString() {
        return "Officer";
    }
}
