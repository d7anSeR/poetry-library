package com.kuspanova;

import java.util.Scanner;

public class MiddleFourth {
    public static void main(String[] args) {
        /**
         * Нужно написать программу — помощника по кухне.
         * Помощник должен определять, какое блюдо можно приготовить из имеющихся продуктов.
         * В программу сначала вводятся продукты.
         * А далее нужно определить, возможно ли из имеющихся продуктов приготовить яичницу,
         * омлет или кофе. Для омлета требуется молоко и яйца, для яичницы только яйца, для кофе — кофе и молоко.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ингредиенты: ");
        String input = scan.nextLine().toLowerCase();

        boolean hasEggs = input.contains("яйца");
        boolean hasMilk = input.contains("молоко");
        boolean hasCoffee = input.contains("кофе");
        if(hasEggs){
            System.out.println("Яичница");
        }
        if(hasMilk && hasEggs){
            System.out.println("Омлет");
        }
        if(hasCoffee && hasMilk){
            System.out.println("Кофе");
        }
        else if(!hasCoffee && !hasMilk && !hasEggs){
            System.out.println("Ничего нельзя приготовить");
        }
    }
}
