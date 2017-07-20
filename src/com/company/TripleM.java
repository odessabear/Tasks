package com.company;

/**
 * Created by alexander.mikhailov on 27.04.2017.
 */
public class TripleM {
    public  static void main(String[] args){

        int  n = 27;
        int[][][] triple = new  int[3][3][3];

        for ( int i = 0; i < triple.length;i++){
            for ( int j = 0 ; j < triple[i].length;j++){
                for ( int k = 0; k < triple[i][j].length;k++){

                    triple[i][j][k] = (int)(Math.random()*n);


                }
                }
            }
            for (int[][] i : triple){
                for (int [] j : i)
                    for ( int k : j )
                    System.out.printf("%4d  ",k);
                System.out.println();

                    }
                 ;
                }




}
