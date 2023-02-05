package homework3;

import java.util.Random;

public class FieldGenerator {
    private int length;

    private int width;

    private int shipsPerField;

    public FieldGenerator(int length, int width, int countOfShips) {
        this.length = length;
        this.width = width;
        this.shipsPerField = countOfShips;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

        int countOfShip = 0;
        while (countOfShip < shipsPerField) {
            int a = random.nextInt(0, length - 1);
            int b = random.nextInt(0, width - 1);
            boolean horizontal = random.nextBoolean();

            if (horizontal) {
                if (checkToCollisionHorizontal(field, a, b)) {
                    field[a][b] = 2;
                    field[a][b + 1] = 2;
                    countOfShip++;
                }
            } else {

                if (checkToCollisionVertical(field, a, b)) {
                    field[a][b] = 2;
                    field[a + 1][b] = 2;
                    countOfShip++;
                }
            }
        }
        return field;
    }

    private boolean checkToCollisionHorizontal(int[][] field, int a, int b) {
        return (field[a][b] == 0 && field[a][b + 1] == 0);
    }

    private boolean checkToCollisionVertical(int[][] field, int a, int b){
        return (field[a][b] == 0 && field[a +1][b] == 0);
    }
}

