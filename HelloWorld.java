package ru.geekbrains.java_one.lesson_a.online;

public class HelloWorld {

  private static float task1 (int a, int b, int c, int d) { //Задание № 1
      return a * (b + (c / d));
  }

    private static boolean task2 (int x, int y) { //Задание № 2
        int z = x + y;
        if (z > 10 && z <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void task3 (int V){                //Задание № 3
      if (V>=0){
           System.out.println("Число положительное");
      }else {
           System.out.println("Число отрицательное");
      }
    }

    private static String task4 (String name){          //Задание № 4
      return "Привет " + name;   //System.out.println("Привет, " + name);

    }

    private static boolean task5 (int year) {               //Задание № 5*
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }
            public static void main(String[] args) {
       System.out.println(task1(8,2,8,2)); //вызов метода Задания № 1
       System.out.println(task2(8,7)); //task2(8, 6); // вызов метода Задания № 2
       task3(8); // вызов метода Задания № 3
       System.out.println(task4("Илья")); //вызов метода Задания № 4
       System.out.println(task5(2021)); //вызов метода Задания № 5*
           }
}