package com.icontainers;
import com.icontainers.chain.Action;
import com.icontainers.chain.ActionType;
import com.icontainers.chain.Commander;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChainTest {

    /**
     * All possible requests
     */
    private static final Action[] ACTIONS = new Action[]{
            new Action(ActionType.KILL, "kill"),
            new Action(ActionType.STEAL, "steal"),
            new Action(ActionType.DEFEND, "defend"),
    };

    @Test
    public void makeRequestTest() {
        final Commander commander = new Commander();

        for (final Action action : ACTIONS) {
            commander.sendAction(action);
            assertTrue(
                    "Expected all requests to be handled, but [" + action + "] was not!",
                    action.isDone()
            );
        }
    }
}
