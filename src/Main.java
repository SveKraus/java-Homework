import homework3.FieldGenerator;
import homework3.FieldPrinter;
import homework3.Game;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int width = 10;
        int tries = 5;
        int shipsPerField = 10;

        FieldGenerator fieldGenerator = new FieldGenerator(length, width, shipsPerField);
        int[][] field = fieldGenerator.generate();


        Game game = new Game(field, length, width, tries);
        game.start();

        FieldPrinter fieldViewer = new FieldPrinter(length);
        fieldViewer.printField(field);

    }
}