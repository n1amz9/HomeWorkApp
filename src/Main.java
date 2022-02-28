public class Main {

    public static void main(String[] args) {
        printThreeWords();      //  Задание №1
        EndOfCase();    //  окончание задания
        checkSumSign();         //  Задание №2
        EndOfCase();    //  окончание задания
        printColor();           //  Задание №3
        EndOfCase();    //  окончание задания
        compareNumbers();       //  Задание №4
        EndOfCase();    //  окончание задания


    }

    public static void printThreeWords() {  //  Задание №1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {     //  Задание №2
        int a = -2;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {   //  Задание №3
        int value = -5;
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Красный");
        }
    }

    public static void compareNumbers() {   //  Задание №4
        int a = 5;
        int b = 5;
        if (a >= b) {
            System.out.println(" a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void EndOfCase() {        //  окончание задания
        System.out.println("======= Конец задания  =======");
    }
}
