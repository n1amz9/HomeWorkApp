package lesson5.examples;

import java.util.Scanner;

public class TestCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat1 = new Cat("Барсик", "Рыжий", 5);
        Cat cat2 = new Cat("Карасик", "Черный", 3);
        Cat cat3 = new Cat("Мурфик", "Белый", 2);

        System.out.println(cat1.getName() + " привет. Тебе исполнилось целых " + cat1.getAge() + " лет. Твой цвет: " + cat1.color );
        System.out.println(cat2.getName() + " привет. Тебе исполнилось целых " + cat2.getAge() + " лет. Твой цвет: " + cat2.color );
        System.out.println(cat3.getName() + " привет. Тебе исполнилось целых " + cat3.getAge() + " лет. Твой цвет: " + cat3.color );

        System.out.println("введите имя для первого кота");
        cat1.setAge(scanner.nextInt());
        System.out.println(cat1.getName() + " привет. Тебе исполнилось целых " + cat1.getAge() + " лет. Твой цвет: " + cat1.color );
        System.out.println();
    }
}