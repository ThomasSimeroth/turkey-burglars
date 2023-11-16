package com.levelup.forestsandmonsters;

import java.util.ArrayList;
import java.util.List;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    private int numPositions;
    private List<List<Position>> positions;

    public GameMap(){
        this.numPositions=100;
        this.positions = makePositions(10, 10);
    }

    public GameMap(int numRows, int numColumns){
        this.numPositions=numRows*numColumns;
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
        if(direction == DIRECTION.NORTH) {
            return new Position(startingPosition.getX(), startingPosition.getY()+1);
        } else if(direction == DIRECTION.SOUTH) {
            return new Position(startingPosition.getX(), startingPosition.getY()-1);
        } else if (direction == DIRECTION.EAST) {
            return new Position(startingPosition.getX()+1, startingPosition.getY());
        } else if (direction == DIRECTION.WEST) {
            return new Position(startingPosition.getX()-1, startingPosition.getY());
        } else {
            return new Position(0, 0);
        }
    }
}
