package ru.geekbrains.lesson5.animal;

public class Main {

    public static void main(String[] args) {
        Cat c = new Cat("Барсик", 2);
        Dog d = new Dog("Ральф", 1);
        Bird b = new Bird("Рома", 3);
        Horse h = new Horse("Пегас", 15);
        Dog1 d1 = new Dog1("Джек", 7);

        Animal[] zoo = {c, d, b, h, d1};
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].run(600);
            zoo[i].jump(1.2f);
            zoo[i].swim(12);
            System.out.println(zoo[i].getClass().getName());
        }
    }
}
