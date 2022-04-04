package lesson_06_examples;

public class EqualityCheck {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Max", "white", 3);
        Cat cat2 = new Cat("Max", "white", 3);

        System.out.println(cat1.equals(cat2));

        System.out.println("cat1.hashCode() = " + cat1.hashCode());
        System.out.println("cat2.hashCode() = " + cat2.hashCode());
    }

}
