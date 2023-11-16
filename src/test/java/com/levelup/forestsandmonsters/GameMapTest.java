package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {
    @Test
    public void mapHasDefaultPositionsOf100(){
        GameMap gamemap = new GameMap();
        assertEquals(100,gamemap.getNumPositions());
    }

    @Test
    public void mapHasProvidedPositions() {
        GameMap gamemap = new GameMap(5, 6);
        assertEquals(30, gamemap.getNumPositions());
        assertEquals(5, gamemap.getPositions().size());
    }

    @Test
    public void graphCoordinates(){
        GameMap gamemap = new GameMap();
        assertNotNull(gamemap.getPositions());
    }

    @Test
    public void defaultMapHasOneHundredPositions() {
        int numPositions = 100;
        int numRows = 10;
        GameMap gameMap = new GameMap();
        assertEquals(10, gameMap.getPositions().size());
    }

    @Test
    public void firstPositionIsZeroZero() {
        Position expectedPosition = new Position(0, 0);
        GameMap gameMap = new GameMap();
        Position actualPosition = gameMap.getPositions().get(0).get(0);
        assertEquals(expectedPosition.getCoordinates(), actualPosition.getCoordinates());
    }

    @Test
    public void secondPositionIsOneZero() {
        Position expectedPosition = new Position(1, 0);
        GameMap gameMap = new GameMap();
        Position actualPosition = gameMap.getPositions().get(0).get(1);
        assertEquals(expectedPosition.getCoordinates(), actualPosition.getCoordinates());
    }

    @Test
    public void returnsAPosition() {
        GameMap gameMap = new GameMap();
        Position position = new Position(5, 8);
        assertNotNull(gameMap.calculatePosition(position, DIRECTION.NORTH));
    }
}
