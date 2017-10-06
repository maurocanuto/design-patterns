package com.icontainers.chain;

public class Action {

    private final ActionType actionType;
    private final String actionDescription;
    private boolean isDone;

    public Action(ActionType actionType, String actionDescription) {
        this.actionType = actionType;
        this.actionDescription = actionDescription;
    }

    public ActionType getActionType() {
        return this.actionType;
    }

    public String getActionDescription() {
        return this.actionDescription;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public void setDone() {
        this.isDone = true;
    }

    @Override
    public String toString() { return getActionDescription(); }

}
