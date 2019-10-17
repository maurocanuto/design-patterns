package com.canutech.chainofresponsibility;

public class Colonel extends ActionHandler{

    public Colonel(ActionHandler next) {
        super(next);
    }

    @Override
    public void handleAction(Action action) {
        if (ActionType.DEFEND.equals(action.getActionType())) {
            printHandling(action);
            action.setDone();
        } else {
            super.handleAction(action);
        }
    }

    @Override
    public String toString() {
        return "Colonel";
    }
}
