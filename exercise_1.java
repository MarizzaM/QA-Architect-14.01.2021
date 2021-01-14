package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int c = isBiggest(2,5);
        System.out.println(String.format("%d is biggest", c));

        int sum1 = add(55, 99);
        System.out.println(String.format("sum: %d", sum1));

        int dif1 = mul(55, 99);
        System.out.println(String.format("difference : %d", dif1));

        int mul1 = sub(55, 99);
        System.out.println(String.format("product : %d", mul1));

        int a = 6, b = 9;
        System.out.println(String.format("quotient : %s", b != 0 ? div(a, b): "Error"));

    }

    private static int isBiggest(int a, int b){
        return a > b ? a : b;
    }

    private static int add(int a, int b){
        return a+b;
    }

    private static int mul(int a, int b){
        return a*b;
    }

    private static int sub(int a, int b){
        return a-b;
    }

    private static float div(int a, int b){
        return b != 0 ? a/b : 0;
    }
}
