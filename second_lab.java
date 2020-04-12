package ru.geekbrains.second_lab;

import java.util.Arrays;

public class second_lab {

    private static void task1(int[] arr1) {         //Задание № 1
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else
                arr1[i] = 1;
        }
        System.out.println("Результат задания № 1: " + Arrays.toString(arr1));
    }

    private static void task2(int[] arr2) {        //Задание № 2
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1 + (3 * i);
        }
        System.out.println("Результат задания № 2: " + Arrays.toString(arr2));
    }

    private static void task3(int[] arr3) {        //Задание № 3
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("Результат задания № 3: " + Arrays.toString(arr3));
    }

    private static void task4(int[] arr3) {         //Задание № 4
        int max = 0;
        int min = 0;
        int INDmax = 0;
        int INDmin = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > max) {
                max = arr3[i];
                INDmax = i;
            } else {
                min = arr3[i];
                INDmin = i;
            }
        }
        System.out.println("Максимальное число: " + max + ", имеет индекс: " + INDmax);
        System.out.println("Минимальное число: " + min + ", имеет индекс: " + INDmin);
    }

    private static void task5(int[][] arr5) {         //Задание № 5*
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0, j2 = arr5[i].length; j < arr5[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) {
                    arr5[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr5));
    }

    private static boolean task6(int[] arr6) {         //Задание № 6**
        boolean Answer = false;
        for (int j = 1; j < (arr6.length - 1); j++) {
            int leftsum = 0;
            int rightsum = 0;
            for (int i = 0; i < j; i++) {
                leftsum = leftsum + arr6[i];
            }
            for (int i = j; i < arr6.length; i++) {
                rightsum = rightsum + arr6[i];
            }
            if (leftsum == rightsum) {
                Answer = true;
            }
        }
        return Answer;
    }



    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        task1(arr1);

        int[] arr2 = new int[8];
        task2(arr2);

        int[] arr3 = {1, 5, 4, 2, 11, 5, 7, 6, 9, 1};
        System.out.println("Массив к заданию № 3: " + Arrays.toString(arr3));
        task3(arr3);
        task4(arr3);

        int[][] arr5 = new int[5][5];
        task5(arr5);

        int[] arr6 = {5, 1, 2, 1, 4, 3};
        task6(arr6);


    }

}
