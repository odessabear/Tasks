package com.company;

/**
 * Created by alexander.mikhailov on 16.12.2016.
 */
public class Cat {

    String gaff = "";

    public Cat(String gaff) {
        this.gaff = gaff;
    }

    public static void main(String[] args){
        int [] ar1 = new int[10];
        int nn = 2;
        for (int i = 0;i < 10;i++){

            ar1[i] = nn;
            nn = nn + 2;
            System.out.print(ar1[i]+", ");
        }
    }

    static void meow() {
        System.out.println("\n\nmeow");
    }

    void gaff() {
        System.out.printf("gaff: " + gaff);
    }
}
