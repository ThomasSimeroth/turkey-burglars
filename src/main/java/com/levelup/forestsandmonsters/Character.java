package com.levelup.forestsandmonsters;

public class Character {
    
    private String DEFAULT_NAME = "Turkey Burglar";
    private Position DEFAULT_POSITION = new Position(0,0);

    private String name;
    private Position currentPosition;

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

    public Character() {
        this.name = DEFAULT_NAME;
        this.currentPosition = DEFAULT_POSITION;
    }

    public Character(String name) {
        this.name = name;
        this.currentPosition = DEFAULT_POSITION;
    }
}
