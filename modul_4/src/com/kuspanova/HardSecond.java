package com.kuspanova;

import java.util.Scanner;

public class HardSecond {
    public static void main(String[] args) {
        /**
         * Заданы координаты двух фигур — пешки и слона. Определить,
         * находится ли пешка под боем слона. Слон ходит по диагонали,
         * а пешка находится под боем, если стоит на одной диагонали со слоном.
         * Шахматное поле состоит из восьми клеток в ширину и в длину.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую клетку: ");
        char col1Char = scanner.next().toUpperCase().charAt(0);
        int row1 = scanner.nextInt();

        System.out.print("Введите вторую клетку: ");
        char col2Char = scanner.next().toUpperCase().charAt(0);
        int row2 = scanner.nextInt();

        int col1 = col1Char - 'A' + 1;
        int col2 = col2Char - 'A' + 1;

        if (Math.abs(col1 - col2) == Math.abs(row1 - row2)) {
            System.out.println("Yes");
            System.out.println("Клетки находятся на одной диагонали");
        } else {
            System.out.println("No");
            System.out.println("Клетки не находятся на одной диагонали");
        }
    }
}
