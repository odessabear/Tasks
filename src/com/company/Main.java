package com.company;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        Cat murka = new Cat("Murka");
        Cat vaska = new Cat("Vas'ka");

        murka.meow();
        murka.gaff();

        vaska.meow();
        vaska.gaff();
//double x = 10000.0 / 3.0;
//Scanner sc = new Scanner(Paths.get("C:\\MyFiles\\myfile.txt"));

        //    while (sc.hasNext()) {
        //         System.err.println(sc.next());
        PrintWriter out = new PrintWriter("C:\\MyFiles\\myfile.txt");

        out.print("aaaaaa");
        out.close();
        ExampleInterface a = new ExampleInterface() {
            @Override
            public String getHelloWorld() {
                return null;
            }

            @Override
            public String getHelloWorld2() {
                return null;
            }
        };


//System.in.toString();
    }


}


