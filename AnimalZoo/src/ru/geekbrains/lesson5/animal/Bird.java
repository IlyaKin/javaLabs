package ru.geekbrains.lesson5.animal;

public class Bird extends Animal {
    final float maxrunBird = 5f;
    final float maxjumpBird = 0.2f;

    public Bird (String name, int age) {
        super(name, age);
    }


    public void run (float runLength) {
        if (runLength < maxrunBird) {
            System.out.println(this.name + " пробежал");
        }
    }

    public void jump (float jumpHeight) {
        if (jumpHeight < maxjumpBird) {
            System.out.println(this.name + " прыгнул");
        }
    }

    public void swim(float swimLength){
        System.out.println(this.name + " не умеет плавать");
    }
}
