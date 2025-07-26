package com.kuspanova;

import java.util.Scanner;

import static java.util.Collections.min;

public class MiddleFirst {
    public static void main(String[] args) {
        /**
         * Определить, какое из трёх введённых пользователем значений наименьшее, н1аибольшее, среднее.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        System.out.println("min: " + min);
        System.out.println("mid: " + mid);
        System.out.println("max: " + max);
    }
}
