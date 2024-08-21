package Pieces;

public class Knight extends Piece { // horse

    public Knight(Team team, int x, int y) {

        super(team, x, y);
        name = 'K';
    }

    public boolean canMove(Coords to) {

        if (Math.abs(this.coords.x - to.x) == 1 && Math.abs(this.coords.y - to.y) == 2 ||
                Math.abs(this.coords.x - to.x) == 2 && Math.abs(this.coords.y - to.y) == 1)
            return true;
        return false;
    }
}
