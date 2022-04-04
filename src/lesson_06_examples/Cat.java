package lesson_06_examples;

public class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(super.getName() + " is meowing");
    }

    public void play() {
        System.out.println(super.getName() + " is playing");
    }

    public void sleep() {
        System.out.println(super.getName() + " is sleeping");
    }

}

