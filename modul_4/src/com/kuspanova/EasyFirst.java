package com.kuspanova;

import java.util.Scanner;

public class EasyFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = scan.nextInt();
        int y;
        if(x > 0){
            y = 2 * x;
        }else{
            y = -2 * x;
        }
        System.out.printf("y = " + y);
    }
}
