package lesson_06_examples;

public class Dog extends Animal {


        private final String type;


    public String getType() {
        return type;
    }

    @Override
    public void voice() {
        System.out.println(super.getName() + " is barking");
    }

    public Dog(String name, String color, int age, String type) {
            super(name, color, age);
            this.type = type;
        }

        public void eat() {
            System.out.println(super.getName() + " is eating");
        }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", age=" + super.getAge() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
