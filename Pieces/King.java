package Pieces;

import Field.Field;

public class King extends Piece {

    public King(Team team, int x, int y) {

        super(team, x, y);
        name = '♕';
    }

    public boolean canMove(Coords to) {

        if (!(Math.abs(this.coords.x - to.x) <= 1 && Math.abs(this.coords.y - to.y) <= 1))
            return false;

        for (int i = 0; i < Field.field.length; i++) {
            for (int j = 0; j < Field.field[i].length; j++) {
                Piece enemy = Field.field[i][j];
                if (enemy == null)
                    continue;
                if (enemy.getTeam() != this.team && enemy.canMove(to)) {
                    System.out.println("King is in danger there");
                    return false;
                }
            }
        }
        return true;
    }

}