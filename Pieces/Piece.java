package Pieces;

public abstract class Piece {
    
    char name;

    int x, y;

    Team team;

    Coords coords;

    public Piece(Team team, int x, int y) {

        this.team = team;

        this.x = x;
        
        this.y = y;
    }

    public void move(int x, int y) {

        this.x = x;
        
        this.y = y;
    }

    public Team getTeam() {

        return this.team;
    }

    public char getName() {

        return this.name;
    }

    public int getCoordX() {

        return this.x;
    }

    public int getCoordY() {

        return this.y;
    }

    public boolean canMove(Coords coords) {
        
        if (coords.x % 2 == 0) return true;
        return false;
    }
}