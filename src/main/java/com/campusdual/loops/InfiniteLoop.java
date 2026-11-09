package com.campusdual.loops;

import com.campusdual.Utils;

public class InfiniteLoop {

    public static void infiniteLoop() {
        System.out.println("Write a = to stop");
        int number = Utils.integer("How many rabbits are there?:");
        while(true) {
            System.out.println("Ha ha ha, you didn't say the magic word!");
        }
    }

    static void main() {
        infiniteLoop();
    }
}
