package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameStatus;
import com.levelup.forestsandmonsters.Position;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoveSteps {

    GameController testObj = new GameController();
    int startX, startY, endX, endY, moveCount;
    GameController.DIRECTION direction;
    Position currentPosition;

    @Given("the character starts at position with XCoordinates {int}")
    public void givenTheCharacterStartsAtX(int startX) {
        this.startX = startX;
    }

    @Given("starts at YCoordinates {int}") 
    public void givenTheCharacterStartsAtY(int startY) {
        this.startY = startY;
    }

    @Given("the player chooses to move in {word}")
    public void givenCharacterChoosesDirection(String direction) {
        this.direction = GameController.DIRECTION.valueOf(direction);
    }

    @Given("the current move count is {int}")
    public void givenTheCurrentMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    @When("the character moves")
    public void theCharacterMoves() {
        testObj.setCharacterPosition(new Position(this.startX, this.startY));
        testObj.setMoveCount(this.moveCount);
        testObj.move(this.direction);
        com.levelup.forestsandmonsters.Character character = testObj.getCharacter();
        this.currentPosition = character.getPosition();
    }

    @Then("the character is now at position with XCoordinates {int}")
    public void checkXCoordinates(int endX) {
        assertNotNull("Expected position not null", this.currentPosition) ;
        assertEquals(endX, this.currentPosition.getX());
    }

    @Then("YCoordinates {int}")
    public void checkYCoordinates(int endY) {
        assertNotNull("Expected position not null", this.currentPosition);
        assertEquals(endY, this.currentPosition.getY());
    }

    @Then("the new move count is {int}")
    public void checkMoveCount(int endingMoveCount) {
        assertEquals(endingMoveCount, testObj.getStatus().moveCount);
    }

}
