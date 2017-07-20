package com.company;

import java.util.Scanner;

/**
 * Created by alexander.mikhailov on 18.11.2016.
 */
public class Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input n :");
        int n = in.nextInt();
       int nf = 1;
        int i = 1;
        while(i < n ){
       //for ( int i = 1;i < n;i++){
           nf = nf*(n - i + 1);
            i++;

       }
       System.out.println(nf);
    }

}
