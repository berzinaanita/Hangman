package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static final int MaxLives = 7; // max dzīvību skaitu nodefinēju kā konstanti

    public static void main(String[] args) {


        boolean game = true;
        var Visual = new Visual("Hangman");
        Visual.start();


        while (game) {

            System.out.println("Word to guess:");

            GameField newGame = GameField.startNewGame();
            int wrongGuesses = newGame.getWrongGuesses();
            Scanner input = new Scanner(System.in);


            while (wrongGuesses < MaxLives) { // cikls atkārtojas kamēr nav sasniegts max dzīvību skaits

                System.out.println("Please enter letter:");
                System.out.println();
                var guess = input.next();

                GameField.playGame(guess, newGame);
                wrongGuesses = newGame.getWrongGuesses();


            }

            System.out.println("Do you want to play new game? (Y/N)");
            String continueGame = input.next().toUpperCase();



            if (continueGame.equals("Y")) {
             continue;

            } else if (continueGame.equals("N")) {
                break;

            }else {
                System.out.println(" Wrong command, game finished");
                break;
            }

        }


    }

}
