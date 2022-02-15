package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер вектора: ");
        int size = Integer.parseInt(sc.nextLine());
        System.out.print("Введите элементы вектора через пробел: ");
        String[] values = sc.nextLine().split(" ");
        Vector vector1 = new Vector(size, values);
        System.out.println("Для того, чтобы получить элемент вектора, введите: 1\n" +
                "Чтобы изменить элемент вектора, введите: 2\n" +
                "Чтобы получить длину вектора, введите: 3\n" +
                "Чтобы получить минимальное и максимальное значения, введите: 4\n" +
                "Чтобы отсортировать вектор, введите: 5\n" +
                "Чтобы получить евклидовую норму вектора, введите: 6\n" +
                "Чтобы умножить вектор на число введите: 7\n" +
                "Чтобы сложить два вектора введите: 8\n" +
                "Чтобы получить скалярное произведение двух векторов введите: 9");
        int choise = Integer.parseInt(sc.nextLine());
        switch (choise){
            case 1:
                vector1.getElement();
                break;
            case 2:
                vector1.setElement();
                break;
            case 3:
                vector1.getLength();
                break;
            case 4:
                vector1.minMax();
                break;
            case 5:
                vector1.sortUp();
                break;
            case 6:
                vector1.euclid();
                break;
            case 7:
                vector1.multiplyOne();
                break;
            case 8:
                vector1.sum();
                break;
            case 9:
                vector1.multiplyVector();
                break;
            default:
                System.out.println("Вы ввели некорректное число!");
        }

    }
}
