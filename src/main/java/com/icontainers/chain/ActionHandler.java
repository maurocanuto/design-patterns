package com.icontainers.chain;

public abstract class ActionHandler {

    private ActionHandler next;

    public ActionHandler(ActionHandler next) {
        this.next = next;
    }

    public void handleAction(Action action) {
        if (next != null) {
            next.handleAction(action);
        }
    }

    protected void printHandling(Action action) {
        System.out.println(this + " is executing your order: " + action);
    }

}
