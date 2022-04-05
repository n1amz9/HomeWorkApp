package lesson6_homework;


public class Dog extends Animal{
    private static int idCount = 0;
    private static int amount = 0;
    public Dog(String name, String color, int age) {
        super(name, color, age);
        idCount++;
        this.amount = idCount;
    }

    protected void swim(int meter) {

        if (meter >= 10) {
            System.out.println(name + " проплыла " + meter + " метров!");
        }
        else {
            System.out.println(name + " не проплывёт столько. Введенное вами значение " + meter + " превышает максимальные 10 метров");
        }

    }

    protected void run (int meter) {
        if (meter > 500) {
            System.out.println(name + " не пробежит столько. Введенное значение " + meter + " не соответствует максимуму в 500 м");
        }
        else {
            System.out.println(name + " пробежал " + meter + " м");
        }
    }

    private static void idCounter() {
        idCount += 1;
    }

    @Override
    public int getAmount() {
        return this.amount ;
    }
}

