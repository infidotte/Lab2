package com.company;

import java.util.*;

public class Vector {
    private int size;
    private int[] vector;
    Scanner sc = new Scanner(System.in);
    public Vector(int a, String[] b) {
        size = a;
        vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = Integer.parseInt(b[i]);
        }
    }

    public void getElement() {
        System.out.print("Введите порядковый номер элемента: ");
        int a = sc.nextInt()-1;
        int z = 0;
        z = vector[a];
        System.out.println(z);
    }

    public void setElement() {
        System.out.print("Введите порядковый номер элемента: ");
        int a = sc.nextInt()-1;
        System.out.print("Введите новое число: ");
        int b = sc.nextInt();
        vector[a] = b;
        System.out.println(Arrays.toString(vector));
    }

    public void getLength() {
        System.out.println(vector.length);
    }

    public void minMax() {
        int[] copy = vector;
        for (int i = copy.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int tmp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = tmp;
                }
            }
        }
        System.out.println("Min: " + copy[0] + ", Max: " + copy[copy.length - 1]);
    }

    public void sortUp() {
        int[] copy = vector;
        for (int i = copy.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int tmp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(copy));
    }

    public void euclid(){
        double count = 0;
        for(int i : vector){
            count += i*i;
        }
        System.out.println(Math.sqrt(count));
    }

    public void multiplyOne(){
        System.out.print("Введите число для умножения: ");
        int num = sc.nextInt();
        int[] copy = vector;
        int[] arr = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            arr[i] = copy[i]*num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void sum(){
        System.out.print("Введите "+ size + " элементов вектора для сложения через пробел: ");
        String[] vctr = sc.nextLine().split(" ");
        int[] copy = vector;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = copy[i] + Integer.parseInt(vctr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public void multiplyVector(){
        System.out.print("Введите "+ size + " элементов вектора для сложения через пробел: ");
        String[] vctr = sc.nextLine().split(" ");
        int[] copy = vector;
        int res = 0;
        for (int i = 0; i < size; i++) {
            res += copy[i] * Integer.parseInt(vctr[i]);
        }
        System.out.println(res);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "size=" + size +
                ", vector=" + Arrays.toString(vector) +
                '}';
    }
}
