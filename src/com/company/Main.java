package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean game = true;


        GameField newGame = GameField.startNewGame();


        while (true) {

            System.out.println(" Please enter letter:");
            Scanner input = new Scanner(System.in);
            System.out.println();
            var guess = input.next();
//
//        Visual userInput = new Visual(Visual.getUserInput().toString());
//        var guess = userInput.getUserInput();
//
//        GameField.playGame(guess.toString());

            GameField.playGame(guess, newGame);

        }


    }

}
