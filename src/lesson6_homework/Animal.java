package lesson6_homework;

public class Animal {

    private static int idCount = 0;
    protected final String name;
    protected final String color;
    protected final int age;
    protected static int amount;



    protected Animal(String name, String color, int age) {
        idCounter();
        this.name = name;
        this.color = color;
        this.age = age;
        amount = idCounter();
    }

    protected String getName() {
        return name;
    }

    protected String getColor() {
        return color;
    }

    protected int getAge() {
        return age;
    }

    public int getAmount() {
        return idCount;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    private static int idCounter() {
        return idCount += 1;
    }


}
