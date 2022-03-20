package homework_4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;
    public static final char DOT_EMPTY = '-';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner("Введите координаты в формате X Y");

    public static void main(String[] args) {
        initMap();
        printMap();
        humanTurn();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = -1; i < SIZE; i++) {
            if (i == -1) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while (!isCellValid(x, y));
        map[x][y] = DOT_X;// не забыть
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;
    }
}
