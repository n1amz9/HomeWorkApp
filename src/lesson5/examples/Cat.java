package lesson5.examples;

public class Cat {
    int ID = 0;
    String name;
    String color;
    int age;

    public Cat(String name, String color, int age) {
        ID = ID + 1;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }
    public void meow() {
        System.out.println(this.name + " said meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
