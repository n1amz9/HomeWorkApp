package lesson6_homework;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[11];
        Dog[] dogs = new Dog[6];
        Animal[] animals = new Animal[2];

        cats[0] =  new Cat("Кот1", "белый", 3);
        cats[1] =  new Cat("Кот2", "белый", 3);
        cats[2] =  new Cat("Кот3", "белый", 3);
        cats[3] =  new Cat("Кот4", "белый", 3);
        cats[4] =  new Cat("Кот5", "белый", 3);
        cats[5] =  new Cat("Кот5", "белый", 3);
        cats[6] =  new Cat("Кот5", "белый", 3);
        cats[7] =  new Cat("Кот5", "белый", 3);
        cats[8] =  new Cat("Кот5", "белый", 3);
        cats[9] =  new Cat("Кот5", "белый", 3);


        dogs[0] = new Dog("Собака1", "белый", 3);
        dogs[1] = new Dog("Собака2", "белый", 3);
        dogs[2] = new Dog("Собака3", "белый", 3);
        dogs[3] = new Dog("Собака4", "белый", 3);
        dogs[4] = new Dog("Собака5", "белый", 3);
        dogs[5] = new Dog("Собака5", "белый", 3);

        animals[0] = new Animal("Животное1", "белый", 3);

        for (int i = 0; i < 5; i++) {
            System.out.println(cats[i].toString());
            System.out.println(dogs[i].toString());;
        }
        System.out.println("Текущее количество котов = " + cats[0].getAmount());
        System.out.println("Текущее количество собак = " + dogs[0].getAmount());

    }
}
