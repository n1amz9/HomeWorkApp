package lesson_06_examples;

public class Inheritance {

    public static void main(String[] args) {
        Cat cat1 = new Cat ("Max", "white", 3);
        Dog dog1 = new Dog ("Jack", "black", 5, "Husky");

        System.out.println("+++ Cat PART +++");
        System.out.println(cat1.printInfo());
        cat1.play();
        cat1.sleep();
        cat1.voice();
        System.out.println("+++ Dog PART +++");
        System.out.println(dog1.printInfo());
        dog1.eat();
        dog1.voice();

    }

}
