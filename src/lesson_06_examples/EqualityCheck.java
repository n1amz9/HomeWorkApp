package lesson_06_examples;

public class EqualityCheck {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Max", "black", 4);
        Cat cat2 = new Cat("Max", "black", 4);

        System.out.println(cat1.equals(cat2));
    }

}
