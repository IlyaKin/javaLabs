package ru.geekbrains.lesson5.animal;

public class Cat extends Animal {
    final float maxrunCat = 200f;
    final float maxjumpCat = 2f;


    public Cat (String name, int age) {
        super(name, age);}


    public void run (float runLength) {
        if (runLength < maxrunCat) {
            System.out.println(this.name + " пробежал");
        }
    }

    public void jump (float jumpHeight) {
        if (jumpHeight < maxjumpCat) {
            System.out.println(this.name + " прыгнул");
        }
    }

    public void swim(float swimLength){
        System.out.println(this.name + " не умеет плавать");
    }
}
