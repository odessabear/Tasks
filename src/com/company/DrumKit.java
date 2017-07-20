package com.company;

/**
 * Created by alexander.mikhailov on 17.05.2017.
 */
class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println(" bah bah ba-bah");
    }
    void playTopHat(){
        System.out.println("dins dins di-dins");
    }


}

class DrumKitTestDrive{
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
       /* if (d.snare == true){
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();*/
       d.playSnare();
        d.snare = false;
        d.playTopHat();
        if  (d.snare == true){
            d.playSnare();
        }
    }
}