package lesson_07;

public class TestMain {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Карасик", 6);
        cats[2] = new Cat("Носик", 15);
        cats[3] = new Cat("Сопелка", 9);
        cats[4] = new Cat("Мурфик", 20);


        Plate plate1 = new Plate(50);

       plate1.info();

        for (Cat cat : cats) {
            cat.eat(plate1);
            cat.hungryCheck();
            plate1.info();

            System.out.println("======================");
        }

        plate1.info();
    }
}
