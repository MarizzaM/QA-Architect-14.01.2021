package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
//===Task1===
    static Scanner s = new Scanner(System.in);
//===Task2===
    static Random r = new Random();

    public static void main(String[] args) {
//===Task3===
        getString("Please inter PI number");
//===Task4===
        System.out.println(howManyDigits(555));
//===Task4 **===
        System.out.println(howManyDigits((float) 235.4));
//===Task5===
        System.out.println(isLonger(new int[4], 4));
        System.out.println(isLonger(new float[5], 4));
//===Task6===
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,3,2,1};
        System.out.println(arrayEqual(arr1, arr2));
    }

    private static boolean arrayEqual(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            int counter = 0;
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i] == arr2[i]){
                    counter++;
                }
            }
            if (counter == arr1.length){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean isLonger(float[] arr, int len){
        if (arr.length > len){
            return true;
        } else {
            return false;
        }
    }

    private static boolean isLonger(int[] arr, int len){
        if (arr.length > len){
            return true;
        } else {
            return false;
        }
    }

    private static float getString(String msg){
        System.out.println(msg);
        return s.nextFloat();
    }

    private static int howManyDigits (int number){
        return String.valueOf(number).length();
    }

    private static String howManyDigits (float number_f){
        int legnthOfNumber_f = String.valueOf(number_f).length();
        int legnthOfNumber_i = String.valueOf((int)number_f).length();
        String str = "";
        for (int i = 0; i < legnthOfNumber_i; i++){
            str += "*";
        }
        str += ".";
        for (int i = 0; i < legnthOfNumber_f-legnthOfNumber_i-1; i++){
            str += "*";
        }
        return str;
    }
    
}
