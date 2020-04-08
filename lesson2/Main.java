package ru.geekbrains.java2.lesson2;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        try {
            String s = "10 4 1 2\n 2 2 5 6\n 7 1 300 3\n 3 4 6 7";
            getArray(s);
            Sum(getArray(s));
            System.out.println(Sum(getArray(s)));
        } catch (NumberFormatException e) {
            System.out.println("В массиве содержится строка ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Не равен 4х4");
        }

    }

    public static String[][] getArray(String string) throws ArrayIndexOutOfBoundsException {
        String[] s = string.split("\\W+");
        String[][] arr = new String[4][4];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = s[a];
                a++;
            }
        } return arr;
    }

    public static int Sum (String[][] arr) throws NumberFormatException {
        int sum = 0;
        int div = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += Integer.parseInt((arr[i][j]));
                div = sum / 2;
            }
        }
        return div;
    }
}

