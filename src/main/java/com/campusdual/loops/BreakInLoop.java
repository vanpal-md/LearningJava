package com.campusdual.loops;

import com.campusdual.Utils;

public class BreakInLoop {

    public static void breakInLoop() {
        System.out.println("Write a = to stop");
        int number = Utils.integer("How many rabbits are there?:");
        while(true) {
            if (number == 0) {
                System.out.println("Almost");
                break;
            }
            number = Utils.integer("Ha ha ha, you didn't say the magic word!");
        }
    }

    static void main() {
        breakInLoop();
    }
}
