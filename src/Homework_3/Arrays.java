package Homework_3;

import java.sql.Array;
import java.util.Scanner;

public class Arrays {
    public static int[] superArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        System.out.println("===");
        task_4();
        task_5(5, 10);
        task_6();
        System.out.println(task_7(superArray));
        task_08_1(superArray, 5);
        task_08_2(superArray, 5);
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void task_1() {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            switch (myArray[i]) {
                case 1:
                    myArray[i] = 0;
                    break;
                case 0:
                    myArray[i] = 1;
                    break;
            }
        }
        System.out.println(java.util.Arrays.toString(myArray));
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void task_2() {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;
        }
        System.out.println(java.util.Arrays.toString(myArray));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void task_3() {
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 6) {
                myArray[i] *= 2;
            }
        }
        System.out.println(java.util.Arrays.toString(myArray));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void task_4() {
        int[][] MySuperArray;
        MySuperArray = new int[10][10];
        for (int i = 0; i < MySuperArray.length; i++) {
            for (int j = 0; j < MySuperArray[0].length; j++) {
                if (i == j) {
                    MySuperArray[i][j] = 1;
                }
                if (i + j == MySuperArray.length - 1) {
                    MySuperArray[i][j] = 1;
                }
            }
        }
        for (int[] ints : MySuperArray) {
            {
                System.out.println(java.util.Arrays.toString(ints));
            }
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void task_5(int len, int initialValue) {
        int[] resMass = new int[len];
        java.util.Arrays.fill(resMass, initialValue);
        System.out.println(java.util.Arrays.toString(resMass));
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void task_6() {
        int[] resMass = {1, -4, 12, 4, 5, 11, 7, 8, 9, 10};
        int chkMin = 0;
        int chkMax = 0;
        for (int i = 0; i < resMass.length; i++) {
            if (chkMin < resMass[i]) {
                chkMin = resMass[i];
            }
            if (chkMax > resMass[i]) {
                chkMax = resMass[i];
            }
        }
        System.out.println(java.util.Arrays.toString(resMass));
        System.out.println("Максимальное значение: " + chkMax);
        System.out.println("Минимальное значение: " + chkMin);
    }

    //7. ** Написать метод,
    // в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.

    public static boolean task_7(int[] resMass) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < resMass.length; i++) {
            if (i < resMass.length / 2) {
                count1 += resMass[i];
            } else {
                count2 += resMass[i];
            }
        }
        return count1 == count2;
    }

    // 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
    // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    // [1, 2, 3, 4, 5, 6]
    // [0, 0, 0, 1, 2, 3, 4, 5, 6, 7]
    // [0, 0, 0, 0, 1, 2]  n = 4
    // [5, 6, 0, 0, 0, 0]  n = -4

    public static void task_08_1(int[] mass, int n) {  // не усложненая реализация
        int[] sArray = new int[mass.length + n - 1];
        for (int i = 0; i < mass.length; i++) {
            if (i + n <= sArray.length - 1) {
                sArray[i + n] = mass[i];
            }
        }
        System.out.println("Оригинальный массив = " + java.util.Arrays.toString(mass));
        System.out.println("Новый массив = " + java.util.Arrays.toString(sArray));
    }

    public static void task_08_2(int[] mass, int n) {       // mass - массив, количество шагов. Усложненная реализация
        int count = 0;
        int pNull = 0;
        int save = mass[0];
        for (int i = 0; i < mass.length; i++) {
            count++;
            if (count <= n) {
                for (int j = 0; j < mass.length; j++) {
                    save = mass[i];
                    mass[i] = save;
                }
            }
        }
        System.out.println("Новый усложненный массив = " + java.util.Arrays.toString(mass));
    }
}


