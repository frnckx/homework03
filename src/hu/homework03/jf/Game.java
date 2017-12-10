package hu.homework03.jf;

import java.util.Random;
import java.util.Scanner;

public class Game {


    public void playBarkochbaWithNumbers() {
        Random random = new Random();
        int randomNumber = random.nextInt(51);
        boolean Win = false;
        System.out.println("Adjon meg egy számot 0 és 50 között:");


        for (int i = 9; i >= 0; i--) {
            Scanner scanner = new Scanner(System.in);
            int userGuess = scanner.nextInt();
            if (userGuess == randomNumber) {
                Win = true;
                System.out.println("Játékos nyert");
                break;
            } else if (userGuess > randomNumber) {
                System.out.println(" A szám kisebb");
                System.out.println("Következő tipp (lehetőségek száma - " + i + "):");
            } else if (userGuess < randomNumber) {
                System.out.println(" A szám nagyobb");
                System.out.println("Következő tipp (lehetőségek száma - " + i + "):");
            }

        }
        if (!Win) {
            System.out.println("Nem találta ki a számot");


        }
    }
}
