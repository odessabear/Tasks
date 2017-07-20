package com.company;

/**
 * Created by alexander.mikhailov on 23.11.2016.
 */
public class Task6 {
    public static void main(String[] args){
        int orig = 42;
        Task6 x = new Task6();
        int y = x.go(orig);
        System.out.println(orig + " " + y);

    }
    int go(int arg){
        arg = arg *2;
        return arg;
    }
}
