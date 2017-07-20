package com.company;

/**
 * Created by alexander.mikhailov on 25.05.2017.
 */
public class Islands {
    public static void main(String[] args){
       String [] islands = new String[4];
        int [] index = new int[4];
        int y = 0;

        islands[0] = "Bermuds";
        islands[1] = "Fidgi";
        islands[2] = "Azors";
        islands[3] = "Cosumel";

        index[0] = 1 ;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int ref;

        while (y < 4){
            ref = index[y];
         //   System.out.print("islands is ");
            System.out.println(islands[ref]);
            y++;
        }
    }
}
