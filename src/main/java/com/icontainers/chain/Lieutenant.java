package com.icontainers.chain;

public class Lieutenant extends ActionHandler {

    public Lieutenant(ActionHandler next) {
        super(next);
    }

    @Override
    public void handleAction(Action action) {
        if (ActionType.KILL.equals(action.getActionType())) {
            printHandling(action);
            action.setDone();
        } else {
            super.handleAction(action);
        }
    }

    @Override
    public String toString() {
        return "Lieutenant";
    }
}
