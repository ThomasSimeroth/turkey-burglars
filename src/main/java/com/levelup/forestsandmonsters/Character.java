package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {
    
    private String DEFAULT_NAME = "Turkey Burglar";
    private Position DEFAULT_POSITION = new Position(0,0);

    private String name;
    private Position currentPosition;
    private GameMap map;
    private int moveCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return currentPosition;
    }

    public void setPosition(Position position) {
        this.currentPosition = position;
    }

    public GameMap getMap() {
        return this.map;
    }

    public void enterMap(GameMap map) {
        this.map = map;
    }

    public Position move(DIRECTION direction) {
        Position newPosition = map.calculatePosition(currentPosition, direction);
        this.currentPosition = newPosition;
        this.moveCount++;
        return this.currentPosition;
    }

    public int getMoveCount() {
        return this.moveCount;
    }

    public String getGameStatus() {
        return this.name 
            + " is currently on (" 
            + this.currentPosition.getX()
            + "," 
            + this.currentPosition.getY() 
            + ") and has taken "
            + this.moveCount
            + " total moves.";
    }

    public Character() {
        this.name = DEFAULT_NAME;
        this.currentPosition = DEFAULT_POSITION;
        this.moveCount = 0;
    }

    public Character(String name) {
        this.name = name;
        this.currentPosition = DEFAULT_POSITION;
        this.moveCount = 0;
    }
}
