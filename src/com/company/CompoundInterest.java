package com.company;

/**
 * Created by alexander.mikhailov on 21.04.2017.
 */
public class CompoundInterest {
    public  static void main(String[] args){
        final double STARTRATE = 10;
        final  int NRATES = 6;
        final  int NYEARS = 10;

        double[] inerestRate = new double[NRATES];
        for (int j =0 ; j < inerestRate.length; j++)
            inerestRate[j] = (STARTRATE + j)/100.0 ;

        double[][] balances = new  double[NYEARS][NRATES];

        for (int j = 0;j < balances[0].length;j++)
            balances[0][j] = 10000;
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double oldBalance = balances[i - 1][j];

                double interest = oldBalance*inerestRate[j];

                balances[i][j] = oldBalance + interest;

            }
        }
        for (int j = 0; j < inerestRate.length; j++)
            System.out.printf("%9.0f%%", 100*inerestRate[j]);
        System.out.println();

        for (double[] i : balances) {
            for (double j : i) {
                System.out.printf("%10.2f", j);
            }
            System.out.println();
        }

    }
}
