package lesson_07;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isHungry() {
        return isHungry;
    }

    protected void eat(Plate amount) {
        if (!amount.checkFood(this.appetite)) {
            System.out.println(this.name + "у не хватит еды. Он останется голодным :(");
            isHungry = false;
        }

        else {
            System.out.println(this.name + " сьедает " + this.appetite + " количество пищи.");
            amount.decreaseFood(this.appetite);
            this.isHungry = true;
        }
    }

    protected void hungryCheck() {
        if (isHungry) {
            System.out.println( this.name +" сыт");
        } else {
            System.out.println( this.name +" всё ещё голоден");
        }
    }


}
