package com.levelup.forestsandmonsters;

import java.util.ArrayList;
import java.util.List;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    private int numPositions;
    private int numColumns;
    private int numRows;
    private List<List<Position>> positions;

    public GameMap(){
        this.numPositions=100;
        this.numRows=10;
        this.numColumns=10;
        this.positions = makePositions(10, 10);
    }

    public GameMap(int numRows, int numColumns){
        this.numPositions=numRows*numColumns;
        this.numRows=numRows;
        this.numColumns = numColumns;
        this.positions = makePositions(numRows, numColumns);
    }

    private List<List<Position>> makePositions(int numRows, int numColumns) {
        List<List<Position>> positions = new ArrayList<>();

        for(int rowWeAreOn = 0; rowWeAreOn < numRows; rowWeAreOn++) {
            List<Position> row = new ArrayList<>();
            for(int colWeAreOn = 0; colWeAreOn < numColumns; colWeAreOn++) {
                Position newPosition = new Position(colWeAreOn, rowWeAreOn);
                row.add(newPosition);
            }
            positions.add(row);
        }
        return positions;
    }

    public int getNumPositions() {
        return this.numPositions;
    }

    public List<List<Position>> getPositions() {
        return positions;
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        Position newPosition;

        if(direction == DIRECTION.NORTH) {
            newPosition = new Position(startingPosition.getX(), startingPosition.getY()+1);
        } else if(direction == DIRECTION.SOUTH) {
            newPosition = new Position(startingPosition.getX(), startingPosition.getY()-1);
        } else if (direction == DIRECTION.EAST) {
            newPosition = new Position(startingPosition.getX()+1, startingPosition.getY());
        } else if (direction == DIRECTION.WEST) {
            newPosition = new Position(startingPosition.getX()-1, startingPosition.getY());
        } else {
            newPosition = new Position(0, 0);
        }

        if(isPositionValid(newPosition)) {
            return newPosition;
        } else {
            return startingPosition;
        }
    }

    public boolean isPositionValid(Position position) {
        if(position.getX() < 0) {
            return false;
        } else if(position.getY() < 0) {
            return false;
        } else if(position.getX() >= numColumns) {
            return false;
        } else if(position.getY() >= numRows) {
            return false;
        } else {
            return true;
        }
    }
}
