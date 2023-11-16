package com.levelup.forestsandmonsters;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private int numPositions;
    private List<List<Position>> positions;

    public GameMap(){
        this.numPositions=100;
        this.positions = new ArrayList<>();
    }

    public GameMap(int size){
        this.numPositions=size*size;
        List<List<Position>> positions = new ArrayList<>();
        Position newPosition = new Position(3, 8);
        List<Position> row = new ArrayList<>();
        row.add(newPosition);
        positions.add(row);

        this.positions = positions;
    }

    public 

    public int getNumPositions() {
        return this.numPositions;
    }

    public List<List<Position>> getPositions() {
        return positions;
    }
}
