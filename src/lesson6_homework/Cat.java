package lesson6_homework;

public class Cat extends Animal{

    private static int idCount = 0;
    private static int amount;

    protected Cat(String name, String color, int age) {
        super(name, color, age);
        idCount++;
        this.amount = idCount;
    }

    protected void swim(int meter) {
        System.out.println("Коты не умеет плавать");
    }

    protected void run (int meter) {
        if (meter > 200) {
            System.out.println(name + " не пробежит столько. Введенное значение " + meter + " не соответствует максимуму в 200 м");
        }
        else {
            System.out.println(name + " пробежал " + meter + " м");
        }
    }


    @Override
    public int getAmount() {
        return this.amount ;
    }
    private static void idCounter() {
        idCount += 1;
    }

}
