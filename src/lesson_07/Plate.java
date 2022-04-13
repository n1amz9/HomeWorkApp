package lesson_07;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean checkFood(int amount)  {
        return this.food >= amount;
        }


    public void decreaseFood (int amount) {
        if (checkFood(amount)) {
            this.food -= amount;
        } else {
            System.out.println("Столько нельзя сьесть. В тарелке осталось " + this.food + ". А кот пытается сьесть: " + amount);
        }


    }

    protected void info() {
        System.out.println("Текущее количество еды: " + this.food);
    }

    protected void addFood(int amount) {
        int finalAmount = this.food + amount;
        System.out.println("В тарелку добавили " + amount + " количество пищи. Текущее количество еды = " + finalAmount);
        setFood(finalAmount);

    }

}
