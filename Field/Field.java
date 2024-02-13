package Field;

import Pieces.*;

public class Field {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public static Piece[][] field = new Piece[8][8];

    public static void startField() {

        for (int i = 0; i < 8; i++) {
            field[1][i] = new Pawn(Team.BLACK, i + 1, 7);
            field[6][i] = new Pawn(Team.WHITE, i + 1, 2);
        }

        field[0][0] = new Rook(Team.BLACK, 1, 8);
        field[0][7] = new Rook(Team.BLACK, 8, 8);
        field[0][1] = new Knight(Team.BLACK, 2, 8);
        field[0][6] = new Knight(Team.BLACK, 7, 8);
        field[0][2] = new Bishop(Team.BLACK, 3, 8);
        field[0][5] = new Bishop(Team.BLACK, 6, 8);
        field[0][3] = new King(Team.BLACK, 4, 8);
        field[0][4] = new Queen(Team.BLACK, 5, 8);

        field[7][0] = new Rook(Team.WHITE, 1, 8);
        field[7][7] = new Rook(Team.WHITE, 8, 8);
        field[7][1] = new Knight(Team.WHITE, 2, 8);
        field[7][6] = new Knight(Team.WHITE, 7, 8);
        field[7][2] = new Bishop(Team.WHITE, 3, 8);
        field[7][5] = new Bishop(Team.WHITE, 6, 8);
        field[7][3] = new King(Team.WHITE, 4, 8);
        field[7][4] = new Queen(Team.WHITE, 5, 8);
    }

    public static void printField() {

        System.out.print("\n" + " ".repeat(55) + "  A   B   C   D   E   F   G   H");
        System.out.print("\n" + " ".repeat(55) + ANSI_BACKGROUND);

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print("+" + "-".repeat(3));
            }
            System.out.print("+" + ANSI_RESET + "\n" + " ".repeat(53) + (field.length - i) + " " + ANSI_BACKGROUND);
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != null) {
                    if (field[i][j].getTeam() == Team.BLACK)
                        System.out.print("| " + ANSI_RED + field[i][j].getName() + ANSI_RESET + ANSI_BACKGROUND + " ");
                    else
                        System.out.print("| " + ANSI_BLUE + field[i][j].getName() + ANSI_RESET + ANSI_BACKGROUND + " ");
                } else
                    System.out.print("|   ");
            }
            System.out.print("|" + ANSI_RESET + " " + (field.length - i) + ANSI_BACKGROUND);
            System.out.print(ANSI_RESET + "\n" + " ".repeat(55) + ANSI_BACKGROUND);
        }
        System.out.print("+---".repeat(8) + "+" + ANSI_RESET);
        System.out.print("\n" + " ".repeat(55) + "  A   B   C   D   E   F   G   H");
    }
}