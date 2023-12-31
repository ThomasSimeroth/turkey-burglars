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

    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    public Character getCharacter() {
        return this.objCharacter;
    }

    public void createCharacter(String name) {
        if(name == null || name == "") {
            objCharacter = new Character();
        } else {
            objCharacter = new Character(name);
        }
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        gameMap = new GameMap();
        if(objCharacter == null) {
            objCharacter = new Character();
        }
        enterGameMap();
    }

    public GameStatus getStatus() {
        GameStatus status = new GameStatus();
        status.characterName = objCharacter.getName();
        status.currentPosition = objCharacter.getPosition();
        status.moveCount = objCharacter.getMoveCount();
        return status;
    }

    public void enterGameMap() {
        objCharacter.enterMap(gameMap);
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results

        objCharacter.move(directionToMove);
        System.out.println(objCharacter.getName() + " moved to position (" + objCharacter.getPosition().getX() + "," 
        + objCharacter.getPosition().getY() + ") for a total of " + objCharacter.getMoveCount() + " move(s).");

    }

    public void setCharacterPosition(Position coordinates) {
        Position objPosition = new Position(coordinates.getX(), coordinates.getY());
        objCharacter.setPosition(objPosition);
    }

    public void setMoveCount(int moveCount) {
        objCharacter.setMoveCount(moveCount);
    }

    public int getTotalPositions() {
        return gameMap.getNumPositions();
    }

    public String getCharacterName()
    {
        return objCharacter.getName();
    }

}
