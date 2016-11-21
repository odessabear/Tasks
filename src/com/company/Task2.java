package com.company;

import java.util.Scanner;

/**
 * Created by alexander.mikhailov on 18.11.2016.
 */
public class Task2 {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input number a ");
        int a = in.nextInt();

        System.out.println("Input number b ");
        int b = in.nextInt();

        System.out.println("Input number c ");
        int c = in.nextInt();

        System.out.println("Input number d ");
        int d = in.nextInt();

        int q = 0;

        if (a >= b && a >= c && a >= d){
            q ++;
        }

        if (b >= a && b >= c && b >= d ){
                q++;
            }

        if (c >= a && c >= b && c >=d) {
            q++;
        }
        if (d >= a && d >=b && d >= c){
            q++;
        }

        System.out.println("Quality of higest numbers is " + q);
        System.out.println("OK");

    }
}
