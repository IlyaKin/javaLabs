package ru.geekbrains.lesson4.staff;

import java.util.Arrays;

public class Main {

	public static void x(Staff Arr) {
		System.out.println("Фамилия - " + Arr.getSurname() + ", Должность - " + Arr.getPosition());
	}

	public static void y(Staff Arr) {
		System.out.println(Arr.getSurname() + " salary =  " + Arr.setSalary());
	}

	public static void z(int n, int a, int b) {
		int midAge;
		int midSalary;
		midAge = a / n;
		midSalary = b / n;

		System.out.println("Средний возраст сотрудников = " + midAge + ", Средняя зарплата = " + midSalary);
	}


	public static void main(String[] args) {
		Staff st1 = new Staff("Johnson", "Administrator", 51000, 75);
		Staff st2 = new Staff("Benigton", "Director", 100000, 41);
		Staff st3 = new Staff("Avdienko", "Cook", 60000, 65);
		Staff st4 = new Staff("Kin", "Specialist", 55000, 28);
		Staff st5 = new Staff("Smith", "Lawyer", 40000, 25);
		Staff[] StaffArray = {st1, st2, st3, st4, st5};

		//ЗАдание 4
		for (int i = 0; i < StaffArray.length; i++) {
			x(StaffArray[i]);
		}
		//Задание 5
		System.out.println("Сотрудники старше 40 лет: ");
		for (int i = 0; i < StaffArray.length; i++) {
			if (StaffArray[i].getage() > 40) {
				System.out.println(StaffArray[i].getSurname() + "-" + StaffArray[i].getPosition() + ", age= "+ StaffArray[i].getage());
			}
		}
		// Задание 6
		for (int i = 0; i < StaffArray.length; i++) {
			y(StaffArray[i]);
		}

		//Задание 7
		int a = 0;
		int b = 0;
		for (int i = 0; i < StaffArray.length; i++) {
			a += StaffArray[i].getage();
			b += StaffArray[i].getSalary();
		}
			z(StaffArray.length, a, b);
		}
	}

