package ru.geekbrains.lesson5.animal;

public class Horse extends Animal {
    final float maxrunHorse = 1500f;
    final float maxjumpHorse = 3f;
    final float maxswimHorse = 100f;

    public Horse (String name, int age) {
        super(name, age);
    }

    public void run (float runLength) {
        if (runLength < maxrunHorse) {
            System.out.println(this.name + " пробежал");
        }
    }

    public void jump (float jumpHeight) {
        if (jumpHeight < maxjumpHorse) {
            System.out.println(this.name + " прыгнул");
        }
    }

    public void swim (float swimLength) {
        if (swimLength < maxswimHorse) {
            System.out.println(this.name + " проплыл");
        }
    }
}
