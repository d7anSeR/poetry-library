package com.kuspanova;

import java.util.Scanner;

import static java.lang.Math.pow;

public class MiddleFifth {
    public static void main(String[] args) {
        /**
         * Написать программу, которая будет определять, есть ли действительные корни у квадратного уравнение.
         * Квадратное уравнение можно записать следующим образом: ax^2+bx+c=0.
         * Пользователь вводит параметры a, b и c.
         * Если дискриминант квадратного уравнения больше или равен 0,
         * то уравнение имеет действительные корни, если дискриминант меньше нуля, то уравнение не имеет корней.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scan.nextInt();
        System.out.println("Введите b: ");
        int b = scan.nextInt();
        System.out.println("Введите c: ");
        int c = scan.nextInt();
        if (pow(b, 2) - 4 * a * c >= 0) {
            System.out.println("Есть действительные корни");
        } else {
            System.out.println("Нет действительных корней");
        }
    }
}
