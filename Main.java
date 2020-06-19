package ru.geekbrains.java3.homeW1;

import java.util.*;

public class Main {
    //меняем местами 2 элемента массива (1ый и последний)
    static void changePos (String[] s){
        String s1 = s[0];
        s[0] = s[s.length-1];
        s[s.length-1] = s1;
        System.out.println(Arrays.toString(s));
    }

    static void arraysToArrList (String[] arrList){
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, arrList);
        System.out.println(list);
    }

    public static void main(String[] args) {
	String[] arr = {"Hello", "Java3", "Welcome", "to", "the", "lesson"};
	changePos(arr);
	arraysToArrList(arr);
    }
}
