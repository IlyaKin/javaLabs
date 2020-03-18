package ru.geekbrains.lesson5.animal;

public class Dog1 extends Dog {
    final float maxrunDog1 = 800f;
    final float maxjumpDog1 = 1.5f;
    final float maxswimDog1 = 15f;

    public Dog1 (String name, int age) {
        super(name, age);
}
    public void run (float runLength) {
        if (runLength < maxrunDog1) {
            System.out.println(this.name + " пробежал");
        }
    }

    public void jump (float jumpHeight) {
        if (jumpHeight < maxjumpDog1) {
            System.out.println(this.name + " прыгнул");
        }
    }

    public void swim (float swimLength) {
        if (swimLength < maxswimDog1) {
            System.out.println(this.name + " проплыл");
        }
    }

}
