package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";
    private Character objCharacter;
    private GameMap gameMap;

    GameStatus status;

    public GameController() {
        status = new GameStatus();
        objCharacter = new Character();
        startGame();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    public Character getCharacter() {
        return this.objCharacter;
    }

    public void createCharacter(String name) {
        objCharacter = new Character(name);
    }

    public void createCharacter() {
        objCharacter = new Character();
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        gameMap = new GameMap();
        objCharacter = new Character();
        objCharacter.enterMap(gameMap);
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void enterGameMap() {
        gameMap = new GameMap(10,10);
        objCharacter.enterMap(gameMap);
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results

        objCharacter.move(directionToMove);

    }

    public void setCharacterPosition(Position coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
        Character objCharacter = new Character();
        Position objPosition = new Position(getTotalPositions(), getTotalPositions());
        objCharacter.setPosition(objPosition);
    }

    public void setMoveCount(int moveCount) {
        objCharacter.setMoveCount(moveCount);
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
