package ru.geekbrains.lesson5.animal;

public abstract class Animal extends Object {
    protected String name;
    protected int age;
    protected float runLength;
    protected float jumpHeight;
    protected float swimLength;



    public Animal(String name, int age ){
        this.name = name;
        this.age = age;
    }

    public abstract void run(float runLength);
    public abstract void jump(float jumpHeight);
    public abstract void swim(float swimLength);
}
