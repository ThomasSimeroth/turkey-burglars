package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class FakeCharacter {
    
    private String DEFAULT_NAME = "Turkey Burglar";
    private Position DEFAULT_POSITION = new Position(0,0);

    private String name;
    private Position currentPosition;
    private GameMap map;

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
        return this.currentPosition;
    }

    public FakeCharacter() {
        this.name = DEFAULT_NAME;
        this.currentPosition = DEFAULT_POSITION;
    }

    public FakeCharacter(String name) {
        this.name = name;
        this.currentPosition = DEFAULT_POSITION;
    }
}
