package com.campusdual.loops;

import com.campusdual.Utils;

public class DoWhileLoop {

    public static void interactiveMenu () {
        int opt;

        do {
            System.out.println("\nInteractive Menu");
            System.out.println("1. Print 'Hi'");
            System.out.println("2. Print 'Bye'");
            System.out.println("3. Print 'Exit'");
            opt = Utils.integer("Choose an option: ");
            switch (opt) {
                case 1:
                    System.out.println("Hi!");
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
                case 3:
                    System.out.println("Exit!");

                default:
                    System.out.println("This is not an option. Please, choose another option.");
                    break;
            }
        } while (opt != 3);
    }

    static void main() {
        interactiveMenu();
    }
}
