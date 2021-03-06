package com.company;

/**
 * Created by alexander.mikhailov on 05.05.2017.
 */

/**
 * Created by X501A on 02.05.2017.
 */
class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }
    public boolean find(long searchkey){
        int j;
        for (j = 0; j < nElems; j++)
            if ( a[j] == searchkey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }
    public void insert(long value){
        a[nElems] = value;
        nElems ++;
    }
    public boolean delete(long value){
        int j;
        for (j = 0;j< nElems; j++)
            if (value == a[j])
                break;
        if (j == nElems)
            return false;
        else
        {
            for ( int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems --;
            return true;

        }

    }
    public void display()
    {
        for (int j = 0; j < nElems; j++)
            System.out.print( a[j]+ " ");
        System.out.println();
    }

    public long getMax() {
        int i;
        long maxNumber = 0;
        for ( i = 0;i < nElems;i++) {

            if (a[i] > maxNumber) {
                maxNumber = a[i];
            }

        }

        if (nElems==0){
            maxNumber = -1;

        }
        System.out.println("value " + maxNumber);
        return a.length == 0 ? -1 : maxNumber;

    }

}
class HighArrayApp{
    public static void main(String[] args){
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

       /* arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);*/

        arr.display();


        int searchkey = 35;

        if (arr.find(searchkey))
            System.out.println("Found " + searchkey);
        else
            System.out.println("Can't find " + searchkey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
        arr.getMax();
        //long max = arr.getMax();
        //System.out.println("max: " + max);

    }
}

