package com.company;

import java.util.Scanner;

/**
 * Created by alexander.mikhailov on 18.11.2016.
 */
public class Task1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number a ");
        int a = in.nextInt();

        System.out.println("Input number b ");
        int b = in.nextInt();

        System.out.println("Input number c ");
        int c = in.nextInt();

        System.out.println("Input number d ");
        int d = in.nextInt();

        if (a < b && a < c && a < d) {
            System.out.println("minimal  " + a);
        }
        if (b < a && b < c && b < d){
            System.out.println("minimal " + b);
    }
        if (c < a && c < b && c < d){
            System.out.println("minimal " + c);
        }
        if (d < a && d < b && d < c){
            System.out.println("mininimal " + d);
        }
    }
}
