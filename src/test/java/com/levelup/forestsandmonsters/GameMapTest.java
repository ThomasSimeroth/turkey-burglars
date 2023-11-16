package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {
    private final int DEFAULT_POSITIONS = 100;
    private final int DEFAULT_ROWS = 10;
    private final int ARBITRARY_NUM_ROWS = 5;
    private final int ARBITRARY_NUM_COLUMNS = 6;
    private GameMap gameMap;

    @Before
    public void setUpGameMap() {
        gameMap = new GameMap();
    }

    @Test
    public void mapHasDefaultPositionsOf100(){
        assertEquals(DEFAULT_POSITIONS, gameMap.getNumPositions());
    }

    @Test
    public void mapHasProvidedPositions() {
        GameMap gameMap = new GameMap(ARBITRARY_NUM_ROWS, ARBITRARY_NUM_COLUMNS);
        assertEquals(ARBITRARY_NUM_ROWS * ARBITRARY_NUM_COLUMNS, gameMap.getNumPositions());
        assertEquals(ARBITRARY_NUM_ROWS, gameMap.getPositions().size());
    }

    @Test
    public void mapHasPositionsSet(){
        assertNotNull(gameMap.getPositions());
    }

    @Test
    public void defaultMapHasTenRows() {
        assertEquals(DEFAULT_ROWS, gameMap.getPositions().size());
    }

    @Test
    public void firstPositionIsZeroZero() {
        Position expectedPosition = new Position(0, 0);
        Position actualPosition = gameMap.getPositions().get(0).get(0);
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void secondPositionIsOneZero() {
        Position expectedPosition = new Position(1, 0);
        Position actualPosition = gameMap.getPositions().get(0).get(1);
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void firstPositionOnSecondRowIsZeroOne() {
        Position expectedPosition = new Position(0, 1);
        Position actualPosition = gameMap.getPositions().get(1).get(0);
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void calculatePostionReturnsAPosition() {
        Position position = new Position(5, 8);
        assertNotNull(gameMap.calculatePosition(position, DIRECTION.NORTH));
    }

    @Test
    public void calculatePositionWhenGoingNorth() {
        Position currentPosition = new Position(2, 2);
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.NORTH);
        Position expectedPosition = new Position(2, 3);
        assertEquals(expectedPosition, newPosition);
    }

    @Test
    public void calculatePositionWhenGoingSouth() {
        Position currentPosition = new Position(2, 2);
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.SOUTH);
        Position expectedPosition = new Position(2, 1);
        assertEquals(expectedPosition, newPosition);
    }

    @Test
    public void calculatePositionWhenGoingEast() {
        Position currentPosition = new Position(2, 2);
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.EAST);
        Position expectedPosition = new Position(3, 2);
        assertEquals(expectedPosition, newPosition);
    }

    @Test
    public void calculatePositionWhenGoingWest() {
        Position currentPosition = new Position(2, 2);
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.WEST);
        Position expectedPosition = new Position(1, 2);
        assertEquals(expectedPosition, newPosition);
    }

    @Test
    public void calculatePositionWhenHittingWall() {
        Position currentPosition = new Position(3, 5);
        GameMap gameMap = new FakeValidationGameMap();
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.WEST);
        Position expectedPosition = new Position(3, 5);
        assertEquals(expectedPosition, newPosition);
    }
}
