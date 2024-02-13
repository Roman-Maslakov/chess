package Pieces;

public class Pawn extends Piece implements Operable{
 
    public Pawn(Team team, int x, int y) {

        super(team, x, y);
        name = 'P';
    }

    public boolean canMove(int x, int y) {

        return true;
    }
}