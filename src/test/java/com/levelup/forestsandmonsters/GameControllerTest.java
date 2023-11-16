package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeNoException;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

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
    @Test
    public void checkMove() {
  
  GameController objGameController = new GameController();
  String strDirectionReturned = objGameController.move(DIRECTION.NORTH);
  assertEquals(DIRECTION.valueOf(strDirectionReturned),DIRECTION.NORTH );
    }
}
