package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        assertEquals(expectedPosition.getX(), actualPosition.getX());
        assertEquals(expectedPosition.getY(), actualPosition.getY());
    }

    @Test
    public void secondPositionIsOneZero() {
        Position expectedPosition = new Position(1, 0);
        GameMap gameMap = new GameMap();
        Position actualPosition = gameMap.getPositions().get(0).get(1);
        assertEquals(expectedPosition.getX(), actualPosition.getX());
        assertEquals(expectedPosition.getY(), actualPosition.getY());
    }

    @Test
    public void firstPositionOnSecondRowIsZeroOne() {
        Position expectedPosition = new Position(0, 1);
        GameMap gameMap = new GameMap();
        Position actualPosition = gameMap.getPositions().get(1).get(0);
        assertEquals(expectedPosition.getX(), actualPosition.getX());
        assertEquals(expectedPosition.getY(), actualPosition.getY());
    }

    @Test
    public void returnsAPosition() {
        GameMap gameMap = new GameMap();
        Position position = new Position(5, 8);
        assertNotNull(gameMap.calculatePosition(position, DIRECTION.NORTH));
    }

    @Test
    public void calculatePositionWhenGoingNorth() {
        Position currentPosition = new Position(2, 2);
        GameMap gameMap = new GameMap();
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.NORTH);
        Position expectedPosition = new Position(2, 3);
        assertEquals(expectedPosition.getX(), newPosition.getX());
        assertEquals(expectedPosition.getY(), newPosition.getY());
    }

    @Test
    public void calculatePositionWhenGoingSouth() {
        Position currentPosition = new Position(2, 2);
        GameMap gameMap = new GameMap();
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.SOUTH);
        Position expectedPosition = new Position(2, 1);
        assertEquals(expectedPosition.getX(), newPosition.getX());
        assertEquals(expectedPosition.getY(), newPosition.getY());
    }

    @Test
    public void calculatePositionWhenGoingEast() {
        Position currentPosition = new Position(2, 2);
        GameMap gameMap = new GameMap();
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.EAST);
        Position expectedPosition = new Position(3, 2);
        assertEquals(expectedPosition.getX(), newPosition.getX());
        assertEquals(expectedPosition.getY(), newPosition.getY());
    }

    @Test
    public void calculatePositionWhenGoingWest() {
        Position currentPosition = new Position(2, 2);
        GameMap gameMap = new GameMap();
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.WEST);
        Position expectedPosition = new Position(1, 2);
        assertEquals(expectedPosition.getX(), newPosition.getX());
        assertEquals(expectedPosition.getY(), newPosition.getY());
    }

    @Test
    public void calculatePositionWhenHittingWall() {
        Position currentPosition = new Position(3, 5);
        GameMap gameMap = new FakeValidationGameMap();
        Position newPosition = gameMap.calculatePosition(currentPosition, DIRECTION.WEST);
        Position expectedPosition = new Position(3, 5);
        assertEquals(expectedPosition.getX(), newPosition.getX());
        assertEquals(expectedPosition.getY(), newPosition.getY());
    }
}
