package ru.geekbrains.lesson4.staff;

import java.util.Arrays;

public class Staff {
    private String Surname;
    private String Position;
    private int Salary;
    private int age;

    public String getSurname(){
        return Surname;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    public String getPosition(){
        return Position;
    }
    public void setPosition(String Position){
        this.Position = Position;
    }
    public int getSalary(){
        return Salary;
    }
    public int setSalary() {
        if (age > 45) {
          return  this.Salary += 5000;
        }
        return Salary;
    }
    public int getage (){
        return age;
    }
    public void setage (int age ){
        this.age = age;
    }
    //Задание 2
    public Staff (String Surname, String Position, int Salary, int age){
        this.Surname = Surname;
        this.Position = Position;
        this.Salary = Salary;
        this.age = age;
            }
        }



