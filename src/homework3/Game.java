package homework3;

import java.util.Scanner;

public class Game {
    private int[][] field;

    private int length;
    private int width;

    private int tries;

    public Game(int[][] field, int length, int width, int tries) {
        this.field = field;
        this.length = length;
        this.width = width;
        this.tries = tries;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int points = 0;

        for (int i = 0; i < 10; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first < length && second < width && first >= 0 && second >= 0) {
                int shot = field[first][second];

                if (shot == 0) {
                    System.out.println("Вы не попали");
                } else if (shot == -1) {
                    System.out.println("Вы сюда уже стреляли");

                } else {
                    System.out.println("Вы попали");
                    points++;
                    field[first][second] = -1;
                }
            } else {
                System.out.println("Что-то куда-то не туда");
            }
        }

        System.out.println("Вы набрали: " + points);

    }
}