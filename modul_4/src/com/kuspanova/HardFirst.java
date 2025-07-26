package com.kuspanova;

import java.util.Scanner;

import static java.lang.Math.pow;

public class HardFirst {
    public static void main(String[] args) {
        /**
         * Написать программу, которая в зависимости от выбора пользователя вычисляет
         * площадь одной из трёх геометрических фигур: прямоугольника, треугольника или круга.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название фигуры: ");
        String figure = scan.nextLine().toLowerCase();
        switch (figure){
            case "прямоугольник":
                System.out.println("Введите значения сторон прямоугольника: ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Площадь равна " + a * b);
                break;
            case "треугольник":
                System.out.println("Введите значения стороны и высоты, проведенной к этой стороне треугольника: ");
                int k = scan.nextInt();
                int h = scan.nextInt();
                System.out.println("Площадь равна " + k * h / 2);
                break;
            case "круг":
                System.out.println("Введите значение радиуса круга: ");
                int radius = scan.nextInt();
                System.out.println("Площадь равна " + Math.PI * pow(radius, 2));
                break;
            default:
                System.out.println("Фигура не определена");
        }
    }
}
