package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void checkNamePopulated() {
        GameController testObj = new GameController();
        testObj.createCharacter("Turkey");
        assertNotNull(testObj);
    }
    @Test
    public void checkNameDefault() {
        GameController testObj = new GameController();
        testObj.createCharacter(null);
        assertNotNull(testObj);
    }
}
