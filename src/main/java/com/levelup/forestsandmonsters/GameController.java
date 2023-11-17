package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";
    private Character objCharacter = new Character();

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        // TODO: Write a failing unit test that will force you to set this to the right number
        public int moveCount = -100;

        characterName = objCharacter.getName();
        currentPosition = objCharacter.getPosition();
        moveCount = objCharacter.getMoveCount();
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        Character objCharacter = new Character(name);
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        GameMap objGameMap = new GameMap();
        Character objCharacter = new Character();
        GameMap map = new GameMap(10,10);
        objCharacter.enterMap(map);
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results

        objCharacter.move(directionToMove);

    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
        Character objCharacter = new Character();
        Position objPosition = new Position(getTotalPositions(), getTotalPositions());
        objCharacter.setPosition(objPosition);
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        GameMap objGameMap = new GameMap();
        return  objGameMap.getNumPositions();
    }

    public String getCharacterName()
    {
        return objCharacter.getName();
    }

}
