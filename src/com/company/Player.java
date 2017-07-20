package com.company;

/**
 * Created by alexander.mikhailov on 16.05.2017.
 */
public class Player {

        int number = 0;
        public void guess(){
            number = (int)(Math.random()* 10);
            System.out.println("I think our number is " + number);
        }
    }

