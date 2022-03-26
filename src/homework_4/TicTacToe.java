package homework_4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;
    public static final char DOT_EMPTY = '-';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true)
        {
            humanTurn();
            if (chkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            printMap();

            aiTurn();
            if (chkWin(DOT_O)) {
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

    public static void humanTurn() {            // ход человека
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > SIZE || y > SIZE) {

            }
        }
        while (!isCellValid(x, y));
        System.out.println("Вы походили в на Х:" + x + " Y: " + y);
        map[y][x] = DOT_X;
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

    public static boolean chkWin(char symb) {
        int chk = 0;
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                while (i == chk) {                  // пока строка одна и та же
                    if (map[i][j] == symb) {        // сверяем символ с symb
                        count++;                    // считаем количество схожих кейсов
                    }
                    else {                          // иначе выходим из массива и скипаем строку
                        chk += 1;
                    }
                   if (count == SIZE) {
                       return true;
                   }
                }
            }
        }
        return false;           // если мы пересчитали все элементы, а подходящих не нашлось, то выводим false
    }

}
