package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Printer printer = new Printer();
        String myAge = printer.print("Hello am", 18);
        System.out.println(myAge);

    }
}