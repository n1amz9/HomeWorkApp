package homework_4;

import java.util.Arrays;

public class TicTacToe {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOT_TO_WIN = 3;
    public static final char DOT_EMPTY = '-';
    public static final char DOT_x = 'X';
    public static final char DOT_O = 'O';


    public static void main(String[] args) {
        initMap();
        printMap();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap()
    {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
