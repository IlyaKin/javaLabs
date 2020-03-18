package ru.geekbrains.lesson5.animal;

public class Dog extends Animal {
    final float maxrunDog = 500f;
    final float maxjumpDog = 0.5f;
    final float maxswimDog = 10f;

    public Dog (String name, int age) {
        super(name, age);
    }



    public void run (float runLength) {
        if (runLength < maxrunDog) {
            System.out.println(this.name + " пробежал");
        }
    }

    public void jump (float jumpHeight) {
        if (jumpHeight < maxjumpDog) {
            System.out.println(this.name + " прыгнул");
        }
    }

    public void swim (float swimLength) {
        if (swimLength < maxswimDog) {
            System.out.println(this.name + " проплыл");
        }
    }

}
