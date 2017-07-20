package com.company;

/**
 * Created by alexander.mikhailov on 11.05.2017.
 */
public class GuessGame{
        Player p1;
        Player p2;
        Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isright = false;

        int targetNumber = (int)(Math.random()*10);
        System.out.println("My choise is number - ");
        while (true){
            System.out.println("Number that we need is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("First player sad that this is " + guessp1);
            guessp2 = p2.number;
            System.out.println("Second player sad that this is " + guessp2);
            guessp3 = p3.number;
            System.out.println("Third player sad that this is " + guessp3);

            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isright = true;
            }

            if (p1isRight || p2isRight || p3isright){
                System.out.println("We have a winner!");
                System.out.println("Is first player right?" + p1isRight);
                System.out.println("Is second player right?" + p2isRight);
                System.out.println("Is third player right?" + p3isright);
                System.out.println("Game Over");
                break;
            }
            else {
                System.out.println("Try again.");
            }

        }


    }
        }



