package com.kuspanova;

import java.util.Scanner;

public class MiddleSecond {
    public static void main(String[] args) {
        /**
         * Вводятся два числа (большее и меньшее).
         * Определить, кратно ли первое число второму,
         * то есть делится ли первое число нацело на второе.
         * Вывести на экран сообщение об этом, а также остаток от деления,
         * если первое число не кратно второму.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int a = scan.nextInt(), b = scan.nextInt();
        if (a % b == 0) {
            System.out.println("Число " + a + " делится нацело на " + b);
        } else {
            System.out.println("Число " + a + " не делится нацело на " + b + ". Остаток равен " + (a % b));
        }
    }
}
