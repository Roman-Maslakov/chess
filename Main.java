import Field.Field;
import Pieces.King;

public class Main {

    public static void main(String[] args) {

        Field.startField();
        Field.printField(new King(null, 0, 0));
    }
}