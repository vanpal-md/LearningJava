package com.campusdual.loops;

import com.campusdual.Utils;

public class WhileLoop {

    public static void verifyNumbers() {
        //System.out.println("TEST");
        int num = Utils.integer("Write a number between 10 and 20: ");
        while (num < 10 || num > 20) {
            num = Utils.integer("Not a valid number, try again: ");
        }
        System.out.println("Number " + num + "is a range");
    }

    static void main() {
        verifyNumbers();
    }
}
