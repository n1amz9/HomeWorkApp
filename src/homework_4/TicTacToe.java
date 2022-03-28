package homework_4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOT_TO_WIN = 4;
    public static final char DOT_EMPTY = '-';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin_mod(DOT_O)) {
                System.out.println("Победил ИИ!");
                break;
            }
            aiTurn();
            printMap();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (isWin(DOT_O)) {
                System.out.println("Победил ИИ!");
                break;
            }
        }
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
        System.out.println("Текущий ход");
        System.out.println("=================");
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
        System.out.println("=================");
    }

    public static void humanTurn() {            // ход человека
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > SIZE || y > SIZE) {
                System.out.println("Вы ввели координаты вне обхвата массива. Введите координаты заного");
                printMap();
            }
            if (map[x][y] != DOT_EMPTY) {
                System.out.println("Данная клетка занята. Введите значение снова");
                System.out.println(" ");
                printMap();
            }
        }
        while (!isCellValid(x, y));
        System.out.println("Вы походили в на Х:" + x + " Y: " + y);
        map[y][x] = DOT_X;
    }

    public static boolean isWin(char symbol) {
        if (checkWin_mod(symbol)) {
            return true;
        } else {
            return chkDiag(symbol);
        }
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) {// если координаты находятся вне обхвата массива, то отклонить введенные переменные
        }
        return map[y][x] == DOT_EMPTY;      // проверка, не занята ли выбранная клетка
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.println("Компьютер сделал ход! Точка X: " + x + " Точка Y: " + y);
        map[x][y] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

//    public static boolean chkWin_old(char symb) {           //старая проверка
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
//    }

    public static boolean checkWin_mod(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    rowCounter++;
                } else {
                    rowCounter = 0;
                }
                if (map[j][i] == symbol) {
                    colCounter++;
                } else {
                    colCounter = 0;
                }
                if (rowCounter == DOT_TO_WIN || colCounter == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean chkDiag(char symbol) {
        int firstCounter = 0;
        int secondCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                firstCounter++;
            } else {
                firstCounter = 0;
            }
            if (map[i][map.length - 1 - i] == symbol) {
                secondCounter++;
            } else {
                secondCounter = 0;
            }
            if (firstCounter == DOT_TO_WIN || secondCounter == DOT_TO_WIN) {
                return true;
            }
        }
        return false;
    }

}

