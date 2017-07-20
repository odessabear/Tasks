package com.company;

/**
 * Created by alexander.mikhailov on 26.05.2017.
 */
public class Rt {
    public static void main(String[] args){
        long[] a = new long[10];
        a[0] = 35;
        a[1] = 46;
        a[2] = 34;
        a[3] = 87;
        a[4] = 63;
        a[5] = 22;
        a[6] = 89;
        a[7] = 11;
        a[8] = 38;
        a[9] = 95;
        long max = 0;

        for (int i = 0;i < a.length; i++){

            if (a[i] > max){
                max = a[i];

            }
        }
        System.out.println(max);

    }
}
