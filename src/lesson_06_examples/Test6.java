package lesson_06_examples;

public class Test6 {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Max", "black", 4);
        Cat cat2 = new Cat("John", "black", 4);

        cat1.voice();
        cat2.voice();
    }
}
