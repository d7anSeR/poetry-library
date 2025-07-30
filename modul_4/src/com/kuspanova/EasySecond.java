package com.kuspanova;

import java.util.Scanner;

public class EasySecond {
    public static void main(String[] args) {
        /**
         * Вводится значение от 1 до 4.
         * Вывести на консоль: Зима, если введено 1, Весна — 2, Лето — 3, Осень — 4
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод: ");
        int elem = scan.nextInt();
        switch (elem) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не верная цифра");
        }
    }
}
