Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 0 | 0 | NORTH | 103 | 0 | 1 | 104 |
            | 0 | 0 | SOUTH | 32 | 0 | 0 | 33 |
            | 0 | 0 | EAST | 1 | 1 | 0 | 2 |
            | 0 | 0 | WEST | 67 | 0 | 0 | 68 |
            | 0 | 9 | NORTH | 57 | 0 | 9 | 58 |
            | 0 | 9 | SOUTH | 38 | 0 | 8 | 39 |
            | 0 | 9 | EAST | 45 | 1 | 9 | 46 |
            | 0 | 9 | WEST | 25 | 0 | 9 | 26 |
            | 9 | 9 | NORTH | 58 | 9 | 9 | 59 |
            | 9 | 9 | SOUTH | 83 | 9 | 8 | 84 |