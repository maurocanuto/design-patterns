package com.icontainers.chain;

public class Commander {

    ActionHandler chain;

    public Commander() {
        buildChain();
    }

    private void buildChain() {
        chain = new Colonel(new Officer(new Lieutenant(null)));
    }

    public void sendAction(Action req) {
        chain.handleAction(req);
    }
}
