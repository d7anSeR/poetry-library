package com.kuspanova;

import java.util.Scanner;

public class MiddleThird {
    public static void main(String[] args) {
        /**
         * Заданы длины сторон треугольника.
         * Необходимо определить, может ли существовать треугольник с такими сторонами.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scan.nextInt();
        System.out.println("Введите b: ");
        int b = scan.nextInt();
        System.out.println("Введите c: ");
        int c = scan.nextInt();
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Треугольник существует");
        }
        else{
            System.out.println("Треугольник не существует");
        }
    }
}
