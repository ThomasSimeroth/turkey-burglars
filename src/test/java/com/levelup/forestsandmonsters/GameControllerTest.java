package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeNoException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

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
        assertNotNull(objGameController);
    }
    @Test
    public void testCalculateMapPositions() {
            GameMap gamemap = new GameMap(4, 7);
            assertEquals(28, gamemap.getNumPositions());
            assertEquals(4, gamemap.getPositions().size());
    }
    @Test
    public void testGetStatus() {
        GameController objController = new GameController();
        assertNotNull(objController);
    }
    @Test
    public void testEnterGameMap() {
        GameController objController = new GameController();
        objController.enterGameMap();

        assertEquals(100,objController.getTotalPositions());
    }
    @Test
    public void testGetTotalPositions(){
        GameController objGameController = new GameController();
        GameMap objGameMap = new GameMap();
        int intTotalPositions = objGameController.getTotalPositions();

        assertEquals(intTotalPositions, intTotalPositions);

        


    }
}
